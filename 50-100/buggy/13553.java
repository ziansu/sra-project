public com.buginc.java.math.geometry.Polygon rtt(com.buginc.java.math.geometry.Vector origin, double theta) {
    com.buginc.java.math.geometry.Vector position = position().rem(origin).rtt(theta).add(origin);
    java.util.List<com.buginc.java.math.geometry.Vector> outline = new java.util.ArrayList<>();
    for (com.buginc.java.math.geometry.Vector vector : outline)
        outline.add(vector.rtt(theta));
    
    return new com.buginc.java.math.geometry.Polygon(position, outline);
}