@java.lang.Override
public void run() {
    try {
        if (imageViewReused(photoToLoad))
            return ;
        
        android.graphics.Bitmap bmp = getBitmap(photoToLoad.url);
        memoryCache.put(photoToLoad.url, bmp);
        if (imageViewReused(photoToLoad))
            return ;
        
        com.vincent.massivelist.ImageLoader.BitmapDisplayer bd = new com.vincent.massivelist.ImageLoader.BitmapDisplayer(bmp, photoToLoad);
        handler.post(bd);
    } catch (java.lang.Throwable th) {
        th.printStackTrace();
    }
}