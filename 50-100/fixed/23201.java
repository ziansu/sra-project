protected void populateThumbnailImageView(java.lang.String fileReference, android.widget.ImageView imageView) {
    if (imageView != null) {
        if ((fileReference != null) && (!(fileReference.isEmpty()))) {
            com.bumptech.glide.Glide.with(this).load(fileReference).thumbnail(0.1F).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        }
    }
}