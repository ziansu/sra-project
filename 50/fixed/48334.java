public void createBoundBitmap() {
    xWidth = (xWidth) + 1;
    yHeight = (yHeight) + 1;
    boundBM = android.graphics.Bitmap.createBitmap(xWidth, yHeight, Bitmap.Config.ARGB_8888);
}