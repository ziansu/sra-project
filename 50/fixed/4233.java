private void addInBitmapOptions(android.graphics.BitmapFactory.Options options) {
    options.inMutable = true;
    if ((bitmapPool) != null) {
        options.inBitmap = bitmapPool.getReusableBitmap(options);
    }
}