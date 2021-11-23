@java.lang.Override
public void run() {
    com.bumptech.glide.Glide.with(this).load(new java.io.File(mImagePath)).apply(new com.bumptech.glide.request.RequestOptions().dontAnimate().diskCacheStrategy(DiskCacheStrategy.NONE).skipMemoryCache(true).override(imageSize, imageSize)).into(mImage);
}