private void drawFreqAxis(android.graphics.Canvas c, float labelBeginX, float labelBeginY, boolean drawOnXAxis) {
    if (showFreqAlongX) {
        drawAxis(c, labelBeginX, labelBeginY, drawOnXAxis, GridLabel.Type.FREQ);
    }else {
        drawAxis(c, labelBeginX, labelBeginY, drawOnXAxis, GridLabel.Type.FREQ);
    }
}