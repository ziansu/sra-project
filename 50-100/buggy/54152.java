private void initImageLoader() {
    com.nostra13.universalimageloader.core.DisplayImageOptions options = new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder().cacheInMemory(true).cacheOnDisk(true).considerExifParams(true).bitmapConfig(Bitmap.Config.RGB_565).build();
    com.nostra13.universalimageloader.core.ImageLoaderConfiguration config = new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(this).defaultDisplayImageOptions(options).writeDebugLogs().build();
    com.nostra13.universalimageloader.core.ImageLoader.getInstance().init(config);
}