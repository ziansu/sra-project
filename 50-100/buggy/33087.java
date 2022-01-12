private void initPaint() {
    mRadarLinePaint.setStyle(Paint.Style.STROKE);
    mRadarLinePaint.setStrokeWidth(mRadarLineWidth);
    mRadarLinePaint.setColor(mRadarLineColor);
    mRadarLinePaint.setAntiAlias(true);
    mLayerPaint.setStyle(Paint.Style.FILL);
    mVertexTextPaint.setColor(mVertexTextColor);
    mVertexTextPaint.setTextSize(mVertexTextSize);
    mVertexTextPaint.setAntiAlias(true);
    mValuePaint.setStrokeWidth(dp2px(1));
    mValueTextPaint.setFakeBoldText(true);
}