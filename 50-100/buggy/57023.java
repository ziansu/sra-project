@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    setBackgroundDrawable(backdrop);
    mBackground.draw(mBackgroundCanvas);
    mMaskCanvas.drawColor(Color.BLACK, PorterDuff.Mode.CLEAR);
    super.onDraw(mMaskCanvas);
    mBackgroundCanvas.drawBitmap(mMaskBitmap, 0.0F, 0.0F, mPaint);
    canvas.drawBitmap(mBackgroundBitmap, 0.0F, 0.0F, null);
}