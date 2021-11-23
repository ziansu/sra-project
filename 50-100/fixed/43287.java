@java.lang.Override
public int getHighestVisibleXIndex() {
    float[] pts = new float[]{ mViewPortHandler.contentRight() , mViewPortHandler.contentBottom() };
    getTransformer(AxisDependency.LEFT).pixelsToValue(pts);
    return (java.lang.Math.round(pts[0])) >= (mData.getXValCount()) ? (mData.getXValCount()) - 1 : ((int) (java.lang.Math.round(pts[0])));
}