@java.lang.Override
public void putBitmap(java.lang.String key, android.graphics.Bitmap bmp) {
    if ((null == key) || (null == bmp))
        return ;
    
    this.images.put(key, bmp);
}