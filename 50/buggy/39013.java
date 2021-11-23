public void run() {
    if (bitmap != null) {
        updateFromBitmap(bitmap);
    }else {
        org.gearvrf.NativeBitmapImage.update(bitmapImage.getNative(), width, height, grayscale);
    }
}