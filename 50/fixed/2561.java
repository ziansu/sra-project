public void addBoundaryGate(double tlx, double tly, double brx, double bry, java.lang.Object sceneToSwitchTo) {
    boundaryCalculator.addBoundaryGate(sceneToSwitchTo, new com.github.a2g.core.primitive.PointF(tlx, tly), new com.github.a2g.core.primitive.PointF(brx, bry));
}