public synchronized void setImageBitmap(android.graphics.Bitmap bitmap) {
    this.bitmap = bitmap;
    if (bitmap != null) {
        this.src.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.dst.set(0, 0, getWidth(), getHeight());
        this.paint.setAntiAlias(true);
    }
    invalidate();
}