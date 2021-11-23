@java.lang.Override
public void onCreate() {
    com.nostra13.universalimageloader.core.ImageLoaderConfiguration config = new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(this).threadPriority(((java.lang.Thread.NORM_PRIORITY) - 2)).denyCacheImageMultipleSizesInMemory().diskCacheFileNameGenerator(new com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator()).diskCacheSize(((50 * 1024) * 1024)).tasksProcessingOrder(QueueProcessingType.LIFO).build();
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().init(config);
}