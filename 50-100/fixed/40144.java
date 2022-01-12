public static com.owncloud.android.datamodel.ThumbnailsCacheManager.ThumbnailLocalGenerationTask getBitmapLocalWorkerTask(android.widget.ImageView imageView) {
    if (imageView != null) {
        final android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable instanceof com.owncloud.android.datamodel.ThumbnailsCacheManager.AsyncLocalDrawable) {
            final com.owncloud.android.datamodel.ThumbnailsCacheManager.AsyncLocalDrawable asyncDrawable = ((com.owncloud.android.datamodel.ThumbnailsCacheManager.AsyncLocalDrawable) (drawable));
            return asyncDrawable.getBitmapWorkerTask();
        }
    }
    return null;
}