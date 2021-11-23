@java.lang.Override
public void beginPoly(int windingRule) {
    isConvexSoFar = true;
    firstSegment = true;
    sign = 0;
    assert windingRule == (java.awt.geom.PathIterator.WIND_NON_ZERO) : "Invalid assumption";
}