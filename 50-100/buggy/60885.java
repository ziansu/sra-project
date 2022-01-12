@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    int viewWidthHalf = (this.getWidth()) / 2;
    int viewHeightHalf = (this.getHeight()) / 2;
    int radius;
    if (viewWidthHalf > viewHeightHalf) {
        radius = viewHeightHalf;
    }else {
        radius = viewWidthHalf;
    }
    drawCircle(canvas, backgroundRadius, viewWidthHalf, viewHeightHalf);
    drawIcon(canvas);
    invalidate();
}