@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    super.onDraw(canvas);
    drawGrid(canvas);
    if ((!(xCoordinate.isEmpty())) && (!(yCoordinate.isEmpty()))) {
        drawHumanBoardPlaces(canvas);
    }
    drawPlaces(canvas);
}