@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    if ((mRecorder) != null) {
        drawBars(canvas);
        postInvalidate();
    }
}