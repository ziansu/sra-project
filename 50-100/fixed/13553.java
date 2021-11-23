public com.buginc.java.math.geometry.Polygon rtt(java.util.Vector origin, double theta) {
    java.util.Vector position = position().rem(origin).rtt(theta).add(origin);
    java.util.List<java.util.Vector> outline = new java.util.ArrayList<>();
    for (java.util.Vector vector : this.outline)
        outline.add(vector.rtt(theta));
    
    return new com.buginc.java.math.geometry.Polygon(position, outline);
}