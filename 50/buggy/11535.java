public void updateScreen(android.graphics.Canvas canvas) {
    android.graphics.Paint paintBackground = new android.graphics.Paint();
    canvas.drawBitmap(mBackground, 0, 0, paintBackground);
    mNote.update(canvas);
    mScoreBar.update(canvas);
}