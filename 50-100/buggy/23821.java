@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    initDiagram();
    initPercentageTextSizeToDefault();
    mForegroundPaint.setStrokeWidth((2 * (mRadius)));
    canvas.drawCircle(mCenterX, mCenterY, mRadius, mBackgroundPaint);
    canvas.drawArc(mDiagram, partner.its.com.customview1.DiagramView.DEGREES_270_IS_12_HOURS_CLOCK, mPercentageCountInDegrees, false, mForegroundPaint);
    canvas.drawText(getStringPercentage(), mCenterX, getYPosPercentageText(canvas), mPercentagePaint);
}