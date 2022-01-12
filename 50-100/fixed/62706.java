@java.lang.Override
public void onCurveChanged(float x1, float y1, float x2, float y2) {
    mInterpolator = new net.xamous.bezierinterpolator.BezierInterpolator(x1, y1, x2, y2);
    mParamText.setText(java.lang.String.format(getString(R.string.parameters), x1, y1, x2, y2));
}