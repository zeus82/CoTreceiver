//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.24 at 11:34:23 AM CEST 
//
package mil.army.usareur.g3.mcsd.CotBindings;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * mil.army.usareur.g3.mcsd.cot.bindings.contact package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * mil.army.usareur.g3.mcsd.cot.bindings.contact
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Contact }
     *
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link FlowTags }
     *
     */
    public FlowTags createFlowTags() {
        return new FlowTags();
    }

    /**
     * Create an instance of {@link Image }
     *
     */
    public Image createImage() {
        return new Image();
    }

    /**
     * Create an instance of {@link Link }
     *
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link Remarks }
     *
     */
    public Remarks createRemarks() {
        return new Remarks();
    }

    /**
     * Create an instance of {@link Request }
     *
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link Sensor }
     *
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link Shape }
     *
     */
    public Shape createShape() {
        return new Shape();
    }

    /**
     * Create an instance of {@link Shape.Polyline }
     *
     */
    public Shape.Polyline createShapePolyline() {
        return new Shape.Polyline();
    }

    /**
     * Create an instance of {@link Shape.Ellipse }
     *
     */
    public Shape.Ellipse createShapeEllipse() {
        return new Shape.Ellipse();
    }

    /**
     * Create an instance of {@link Shape.Dxf }
     *
     */
    public Shape.Dxf createShapeDxf() {
        return new Shape.Dxf();
    }

    /**
     * Create an instance of {@link Shape.Polyline.Vertex }
     *
     */
    public Shape.Polyline.Vertex createShapePolylineVertex() {
        return new Shape.Polyline.Vertex();
    }

    /**
     * Create an instance of {@link Spatial }
     *
     */
    public Spatial createSpatial() {
        return new Spatial();
    }

    /**
     * Create an instance of {@link Spatial.Attitude }
     *
     */
    public Spatial.Attitude createSpatialAttitude() {
        return new Spatial.Attitude();
    }

    /**
     * Create an instance of {@link Spatial.Spin }
     *
     */
    public Spatial.Spin createSpatialSpin() {
        return new Spatial.Spin();
    }

    /**
     * Create an instance of {@link Track }
     *
     */
    public Track createTrack() {
        return new Track();
    }

    /**
     * Create an instance of {@link Uid }
     *
     */
    public Uid createUid() {
        return new Uid();
    }
}
