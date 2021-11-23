@java.lang.Override
public android.graphics.Bitmap getBitmap(java.lang.String key) {
    if (null == key)
        return null;
    
    return this.images.get(key);
}