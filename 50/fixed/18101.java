public android.graphics.drawable.Drawable getBitmapToDrawable(android.content.res.Resources resources, android.graphics.Bitmap bitmap) {
    if (bitmap == null)
        return null;
    
    return new android.graphics.drawable.BitmapDrawable(resources, bitmap);
}