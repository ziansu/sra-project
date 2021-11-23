private void createQR() {
    android.graphics.Bitmap b = getQRBitmap();
    co.celloscope.printingdemo.FileHelper.saveBitmapFileToExternalCacheDirectory(this, b, "qr.png");
}