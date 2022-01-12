@java.lang.Override
protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    if ((w > 0) && (h > 0)) {
        mDrawBitmap = android.graphics.Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_4444);
        mDrawCanvas = new android.graphics.Canvas(mDrawBitmap);
    }
    prepareContentRect();
    prepare();
    super.onSizeChanged(w, h, oldw, oldh);
}