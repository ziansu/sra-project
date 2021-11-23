private void setupImageLoader(android.content.Context context) {
    com.nostra13.universalimageloader.core.ImageLoaderConfiguration config = new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(context).memoryCache(new com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache(((2 * 1024) * 1024))).memoryCacheSize(((2 * 1024) * 1024)).denyCacheImageMultipleSizesInMemory().build();
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().init(config);
}