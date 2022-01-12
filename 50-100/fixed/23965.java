float getSlope() {
    c.SegmentedPath lineA = segment;
    c.Vctr3D pointA1 = lineA.getStart();
    float slope0 = 0;
    for (int i = 0; i < (segment.size()); i++) {
        c.Vctr3D pointA2 = lineA.get(i);
        slope0 = ((pointA2.y) - (pointA1.y)) / ((pointA2.x) - (pointA1.x));
        pointA1 = pointA2;
    }
    return slope0;
}