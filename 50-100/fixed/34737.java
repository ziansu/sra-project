@java.lang.Override
public int getLowestVisibleXIndex() {
    float[] pts = new float[]{ mViewPortHandler.contentLeft() , mViewPortHandler.contentBottom() };
    getTransformer(AxisDependency.LEFT).pixelsToValue(pts);
    return (pts[0]) <= 0 ? 0 : ((int) (java.lang.Math.round(((pts[0]) + 1.0F))));
}