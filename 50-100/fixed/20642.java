@java.lang.Override
public void draw(android.graphics.Canvas canvas) {
    super.draw(canvas);
    final float scaleFactorX = (getWidth()) / (com.druger.firstandroidgame.GamePanel.WIDTH);
    final float scaleFactorY = (getHeight()) / (com.druger.firstandroidgame.GamePanel.HEIGHT);
    if (canvas != null) {
        final int savedState = canvas.save();
        canvas.scale(scaleFactorX, scaleFactorY);
        bg.draw(canvas);
        canvas.restoreToCount(savedState);
    }
}