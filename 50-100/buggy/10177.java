@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    gridHeight = getHeight();
    gridWidth = getWidth();
    if ((this.triangulation) != null) {
        plotOnCanvas(canvas);
    }else {
        generateAndInvalidate();
    }
}