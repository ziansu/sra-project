@java.lang.Override
public void run() {
    java.io.File file = android.os.Environment.getExternalStoragePublicDirectory(mImagePath);
    com.bumptech.glide.Glide.with(this).load(file).apply(new com.bumptech.glide.request.RequestOptions().dontAnimate().diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).override(imageSize, imageSize)).into(mImage);
}