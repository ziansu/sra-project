@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... videoId) {
    this.data = java.lang.Long.parseLong(videoId[0]);
    this.videoData = videoId[1];
    android.graphics.Bitmap found = com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.GetInstance(com.mn2square.videolistingmvp.VideoListingMvpApplication.getAppContext()).getBitmapFromDiskCache(videoData);
    if (found != null)
        return found;
    
    android.graphics.Bitmap bitmap = MediaStore.Video.Thumbnails.getThumbnail(cr, this.data, MediaStore.Video.Thumbnails.MINI_KIND, null);
    bitmap = com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapUtil.scaleDownBitmap(com.mn2square.videolistingmvp.VideoListingMvpApplication.getAppContext(), bitmap, 105);
    return bitmap;
}