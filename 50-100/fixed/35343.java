@java.lang.Override
protected void onDraw(android.graphics.Canvas canvas) {
    int min = java.lang.Math.min(this.getWidth(), this.getHeight());
    float offs = min / ((float) (com.gmail.wazappdotgithub.ships.common.Constants.DEFAULT_BOARD_SIZE));
    drawWater(canvas, offs);
    drawGrid(canvas, offs, min);
    if (!(isInEditMode()))
        drawSpecial(canvas, offs);
    
}