@java.lang.Override
public void run() {
    try {
        if (imageViewReused(photoToLoad))
            return ;
        
        android.graphics.Bitmap bmp = getBitmapFromFile(photoToLoad.url);
        if (imageViewReused(photoToLoad)) {
            return ;
        }
        com.example.futin.importimages.RestService.loaders.FileLoader.BitmapDisplayer bd = new com.example.futin.importimages.RestService.loaders.FileLoader.BitmapDisplayer(bmp, photoToLoad);
        handler.post(bd);
    } catch (java.lang.Throwable th) {
        th.printStackTrace();
    }
}