public void draw(android.graphics.Canvas canvas) {
    drawBackground(canvas);
    if (this.isVisible) {
        canvas.drawBitmap(bitmap, this.x, this.y, null);
    }
    drawValue(canvas);
}