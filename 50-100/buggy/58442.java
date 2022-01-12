public void setImageUrl(java.lang.String url) {
    if (android.text.TextUtils.isEmpty(url)) {
        return ;
    }
    mBitmapImageViewTarget = new com.cyanogenmod.messaging.ui.WebImageView.Bullseye(this);
    com.bumptech.glide.Glide.with(getContext()).load(url).asBitmap().fitCenter().diskCacheStrategy(DiskCacheStrategy.RESULT).into(mBitmapImageViewTarget);
}