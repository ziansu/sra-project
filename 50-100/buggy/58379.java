void transform(com.esri.core.geometry.Point2D[] points, int start, int count) {
    int n = java.lang.Math.min(points.length, (start + count));
    for (int i = count; i < n; i++) {
        transform(points[i], points[i]);
    }
}