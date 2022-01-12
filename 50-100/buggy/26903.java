public synchronized void setImageBitmap(android.graphics.Bitmap bitmap) {
    this.bitmap = bitmap;
    if (bitmap != null) {
        this.src = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.dst = new android.graphics.Rect(0, 0, getWidth(), getHeight());
        this.paint = new android.graphics.Paint();
        this.paint.setAntiAlias(true);
    }
    invalidate();
}