private void drawFreqAxis(android.graphics.Canvas c, float labelBeginX, float labelBeginY, float nx, boolean drawOnXAxis) {
    if (showFreqAlongX) {
        drawAxis(c, labelBeginX, labelBeginY, nx, drawOnXAxis, getFreqMin(), getFreqMax(), GridLabel.Type.FREQ);
    }else {
        drawAxis(c, labelBeginX, labelBeginY, nx, drawOnXAxis, getFreqMax(), getFreqMin(), GridLabel.Type.FREQ);
    }
}