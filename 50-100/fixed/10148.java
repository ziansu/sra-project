@java.lang.Override
public android.graphics.Bitmap getDrawingCache(boolean autoScale) {
    final android.graphics.Bitmap b = super.getDrawingCache(autoScale);
    if (mReflectionCacheInvalid) {
        if ((mReflectionCache) == null) {
            try {
                mReflectionCacheInvalid = false;
            } catch (java.lang.NullPointerException e) {
                android.util.Log.e(com.appl.library.VIEW_LOG_TAG, ("Null pointer in createReflectionBitmap. Bitmap b=" + b), e);
            }
        }
    }
    return b;
}