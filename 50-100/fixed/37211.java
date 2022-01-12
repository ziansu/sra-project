public void addPoint(int pointerId, android.graphics.PointF pos) {
    if (points.containsKey(pointerId)) {
        throw new java.lang.IllegalArgumentException("trying to add a point with an already existing index");
    }else {
        commit();
        if (pos == null)
            throw new java.lang.NullPointerException();
        
        points.put(pointerId, new android.util.Pair(pos, pos));
    }
}