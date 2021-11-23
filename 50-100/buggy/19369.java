private void drawGameOver() {
    bufferGraphics.setColor(java.awt.Color.BLACK);
    bufferGraphics.drawString(view.GamePanel.STR_GAMEOVER, (((control.Constants.CONTENT_WIDTH) - (getFontWidth(view.GamePanel.STR_GAMEOVER, 60))) / 2), ((control.Constants.CONTENT_HEIGHT) / 4));
    drawWinning();
    drawScore();
    drawCTC();
}