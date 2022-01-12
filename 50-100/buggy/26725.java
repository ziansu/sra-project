public static boolean cancelPotentialWork(java.lang.String imageName, android.widget.ImageView imageView) {
    final com.bugbinc.fastimagegallery.GalleryAdapter.BitmapWorkerTask bitmapWorkerTask = com.bugbinc.fastimagegallery.GalleryAdapter.getBitmapWorkerTask(imageView);
    if (bitmapWorkerTask != null) {
        final java.lang.String bitmapImageName = bitmapWorkerTask.imageName;
        if (!(bitmapImageName.equals(imageName))) {
            bitmapWorkerTask.cancel(true);
        }else {
            return false;
        }
    }
    return true;
}