@java.lang.Override
public net.sci.geom.geom2d.polygon.Polyline2D reverse() {
    int n = this.vertexNumber();
    java.util.ArrayList<net.sci.geom.geom2d.Point2D> newVertices = new java.util.ArrayList<net.sci.geom.geom2d.Point2D>(n);
    newVertices.add(this.vertices.get(0));
    for (int i = 1; i < n; i++) {
        newVertices.add(this.vertices.get((n - i)));
    }
    net.sci.geom.geom2d.polygon.LinearRing2D reverse = new net.sci.geom.geom2d.polygon.LinearRing2D(0);
    reverse.vertices = newVertices;
    return reverse;
}