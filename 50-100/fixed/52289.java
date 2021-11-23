public java.util.List<java.util.Vector> points() {
    java.util.List<java.util.Vector> points = new java.util.ArrayList<>();
    java.util.Vector prev = position();
    for (java.util.Vector vector : outline) {
        points.add(prev);
        prev = prev.add(vector);
    }
    return points;
}