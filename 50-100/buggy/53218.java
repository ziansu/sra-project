public void movePoint(int pointerId, android.graphics.PointF pos) {
    if (!(points.containsKey(pointerId))) {
        throw new java.lang.IllegalArgumentException("trying to update non-existent index");
    }else {
        android.util.Pair<android.graphics.PointF, android.graphics.PointF> entry = points.get(pointerId);
        points.put(pointerId, new android.util.Pair<android.graphics.PointF, android.graphics.PointF>(entry.first, pos));
    }
}