public com.buginc.java.math.geometry.Polygon dec(java.util.Vector origin, double a) {
    java.util.Vector position = origin.add(position().rem(origin).dec(a));
    java.util.List<java.util.Vector> outline = new java.util.ArrayList<>();
    for (java.util.Vector vector : this.outline)
        outline.add(vector.dec(a));
    
    return new com.buginc.java.math.geometry.Polygon(position, outline);
}