@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if (mIsCurrent) {
        final int width = getWidth();
        final int height = getHeight();
        canvas.drawRect(0, (height - (mStripHeight)), width, height, mStripPaint);
    }
    super.onDraw(canvas);
}