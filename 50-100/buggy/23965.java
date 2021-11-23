float getSlope() {
    c.SegmentedPath lineA = segment;
    c.Vctr3D pointA1 = lineA.getStart();
    c.Vctr3D pointA2 = lineA.get(0);
    float slope0 = ((pointA2.y) - (pointA1.y)) / ((pointA2.x) - (pointA1.x));
    return slope0;
}