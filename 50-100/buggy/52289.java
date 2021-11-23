public java.util.List<com.buginc.java.math.geometry.Vector> points() {
    java.util.List<com.buginc.java.math.geometry.Vector> points = new java.util.ArrayList<>();
    com.buginc.java.math.geometry.Vector prev = position();
    for (com.buginc.java.math.geometry.Vector vector : outline) {
        points.add(prev);
        prev = prev.add(vector);
    }
    return points;
}