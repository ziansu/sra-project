private void createQR() {
    android.graphics.Bitmap b = getQRBitmap();
    if (b != null) {
        co.celloscope.printingdemo.FileHelper.saveBitmapFileToExternalCacheDirectory(this, b, "qr.png");
    }
}