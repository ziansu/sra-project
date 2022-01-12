@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    int viewWidthHalf = (this.getWidth()) / 2;
    int viewHeightHalf = (this.getHeight()) / 2;
    drawCircle(canvas, backgroundRadius, viewWidthHalf, viewHeightHalf);
    drawIcon(canvas);
    invalidate();
}