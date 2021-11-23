public void updateScreen(android.graphics.Canvas canvas) {
    canvas.drawBitmap(mBackground, 0, 0, new android.graphics.Paint());
    mNote.update(canvas);
    mScoreBar.update(canvas);
}