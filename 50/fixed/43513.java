public void draw(android.graphics.Canvas canvas, android.graphics.Rect destination) {
    if (!(isPlaying)) {
        return ;
    }
    canvas.drawBitmap(frames[frameIndex], null, destination, null);
}