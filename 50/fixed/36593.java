@org.junit.Test
public void createPolygon() {
    ops.run(net.imagej.ops.geom.geom2d.DefaultContour.class, net.imagej.ops.geom.GeomTest.region2D, true);
}