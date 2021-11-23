public java.util.ArrayList<toxi.geom.Line3D> getSegments() {
    final int num = vertices.size();
    java.util.ArrayList<toxi.geom.Line3D> segments = new java.util.ArrayList<toxi.geom.Line3D>((num - 1));
    for (int i = 1; i < num; i++) {
        segments.add(new toxi.geom.Line3D(vertices.get((i - 1)), vertices.get(i)));
    }
    return segments;
}