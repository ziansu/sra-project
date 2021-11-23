private void doDraw(android.graphics.Canvas canvas) {
    canvas.save();
    canvas.drawBitmap(BackgroundImage, mx, my, null);
    canvas.restore();
}