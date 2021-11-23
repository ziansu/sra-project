private void commit() {
    this.matrix = getMatrix();
    for (java.util.Map.Entry<java.lang.Integer, android.util.Pair<android.graphics.PointF, android.graphics.PointF>> p : points.entrySet()) {
        p.setValue(new android.util.Pair(p.getValue().second, p.getValue().second));
    }
}