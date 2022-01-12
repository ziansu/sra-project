public com.buginc.java.math.geometry.Polygon dec(com.buginc.java.math.geometry.Vector origin, double a) {
    com.buginc.java.math.geometry.Vector position = origin.add(position().rem(origin).dec(a));
    java.util.List<com.buginc.java.math.geometry.Vector> outline = new java.util.ArrayList<>();
    for (com.buginc.java.math.geometry.Vector vector : this.outline)
        outline.add(vector.dec(a));
    
    return new com.buginc.java.math.geometry.Polygon(position, outline);
}