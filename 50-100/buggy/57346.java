@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    mDrawBitmap = android.graphics.Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_4444);
    mDrawCanvas = new android.graphics.Canvas(mDrawBitmap);
    prepareContentRect();
    prepare();
    super.onSizeChanged(w, h, oldw, oldh);
}