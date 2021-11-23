@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    if ((mRecorder) != null) {
        drawBars(canvas);
        postInvalidate();
    }
}