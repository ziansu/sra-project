@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    int min = java.lang.Math.min(super.getWidth(), super.getHeight());
    int offs = min / (com.gmail.wazappdotgithub.ships.common.Constants.DEFAULT_BOARD_SIZE);
    drawWater(canvas, offs);
    if (!(isInEditMode()))
        drawSpecial(canvas, offs);
    
    drawGrid(canvas, offs, min);
}