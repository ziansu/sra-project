public com.nostra13.universalimageloader.core.DisplayImageOptions getDisplayImageOption(@android.support.annotation.DrawableRes
int icon) {
    return new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder().showImageOnLoading(icon).showImageForEmptyUri(icon).showImageOnFail(icon).cacheInMemory(false).cacheOnDisk(true).imageScaleType(ImageScaleType.EXACTLY).considerExifParams(true).bitmapConfig(Bitmap.Config.RGB_565).displayer(new com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer(1000)).build();
}