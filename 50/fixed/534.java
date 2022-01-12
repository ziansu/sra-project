@java.lang.Override
public void beginPoly(int windingRule) {
    isConvexSoFar = true;
    firstSegment = true;
    sign = 0;
    this.windingRule = windingRule;
}