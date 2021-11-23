@java.lang.Override
protected void onPostExecute(android.graphics.Bitmap bm) {
    com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.GetInstance(com.mn2square.videolistingmvp.VideoListingMvpApplication.getAppContext()).AddBitmapToCache(url, bm);
    if ((imageViewReference) != null) {
        android.widget.ImageView imageView = imageViewReference.get();
        if (imageView != null) {
            com.mn2square.videolistingmvp.utils.thumbnailutils.ThumbnailCreateor.BitmapWorkerTask bitmapDownloaderTask = com.mn2square.videolistingmvp.utils.thumbnailutils.ThumbnailCreateor.getBitmapWorkerTask(imageView);
            if ((this) == bitmapDownloaderTask) {
                imageView.setImageBitmap(bm);
            }
        }
    }
}