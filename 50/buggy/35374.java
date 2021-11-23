public static void drawBG(javafx.scene.canvas.GraphicsContext gc, javafx.scene.image.Image bg) {
    gc.setFill(javafx.scene.paint.Color.DARKBLUE);
    gc.fillRect(0, 0, graphic.DrawingUtility.PLAY_SCREEN_WIDTH, graphic.DrawingUtility.PLAY_SCREEN_HEIGHT);
    gc.drawImage(bg, graphic.DrawingUtility.COUNTER_WIDTH, graphic.DrawingUtility.STATUS_BAR_HEIGHT);
}