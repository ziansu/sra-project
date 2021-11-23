@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if (mIsCurrent) {
        final int width = canvas.getWidth();
        final int height = canvas.getHeight();
        canvas.drawRect(0, (height - (mStripHeight)), width, height, mStripPaint);
    }
    super.onDraw(canvas);
}