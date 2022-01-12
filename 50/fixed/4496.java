protected void init() {
    setScaleType(ImageView.ScaleType.MATRIX);
    android.graphics.drawable.Drawable d = getDrawable();
    android.graphics.Bitmap bmp = ((android.graphics.drawable.BitmapDrawable) (d)).getBitmap();
    setImageBitmapReset(bmp, true);
}