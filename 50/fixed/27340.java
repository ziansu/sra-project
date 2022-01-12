public static com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache GetInstance() {
    if ((com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance) == null) {
        com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance = new com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache();
    }
    return com.mn2square.videolistingmvp.utils.thumbnailutils.BitmapCache.mInstance;
}