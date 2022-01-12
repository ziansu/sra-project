@java.lang.Override
public void run() {
    final android.graphics.Bitmap bitmap = downloadImage(url);
    if (bitmap == null) {
        return ;
    }
    if (imageView.getTag().equals(url)) {
        int byteCount = bitmap.getByteCount();
        android.util.Log.i("bitmap.getByteCount()", (byteCount + ""));
        imageCache.put(url, bitmap);
        imageView.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                imageView.setImageBitmap(bitmap);
            }
        });
    }
}