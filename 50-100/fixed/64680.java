private void drawCircle(android.graphics.Canvas canvas) {
    initDrawStrokeCirclePaint();
    canvas.drawArc(mRectF, 202, mSweepAngle, false, mPaint);
    initDrawAlphaStrokeCirclePaint();
    canvas.drawArc(mRectF, 202, ((mSweepAngle) - 360), false, mPaint);
    initDrawInnerCirclePaint();
    canvas.drawArc(mInnerRectF, 0, 360, false, mPaint);
}