private void initPaint() {
    mRadarLinePaint.setStrokeWidth(mRadarLineWidth);
    mRadarLinePaint.setColor(mRadarLineColor);
    mRadarLinePaint.setStyle(Paint.Style.STROKE);
    mVertexTextPaint.setColor(mVertexTextColor);
    mVertexTextPaint.setTextSize(mVertexTextSize);
    mValuePaint.setStrokeWidth(dp2px(1));
    mLayerPaint.setStyle(Paint.Style.FILL);
}