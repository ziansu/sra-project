public android.graphics.Bitmap getAsBitmap(java.lang.String key) {
    byte[] bytes = getAsBytes(key);
    if (bytes == null)
        return null;
    
    return com.zhy.base.cache.disk.Utils.bytes2Bitmap(bytes);
}