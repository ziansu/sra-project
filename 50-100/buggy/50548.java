protected void populateThumbnailImageView(android.net.Uri uri, android.widget.ImageView imageView) {
    if (imageView != null) {
        if (uri != null) {
            com.bumptech.glide.Glide.with(imageView.getContext()).using(mUriLoad).load(uri).thumbnail(0.1F).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        }
    }
}