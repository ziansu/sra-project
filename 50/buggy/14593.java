@java.lang.Override
public android.graphics.Bitmap onPreSetBitmap(android.widget.ImageView imageView, android.graphics.Bitmap loadedBitmap, java.lang.String url, boolean loadedFromCache) {
    android.util.Log.e("AAA", "Bitmap: onPreSetBitmap REGULAR");
    return loadedBitmap;
}