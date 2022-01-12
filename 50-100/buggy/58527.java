protected void populateCircularImageView(java.lang.String fileReference, final android.widget.ImageView imageView) {
    if (imageView != null) {
        if ((fileReference != null) && (!(fileReference.isEmpty()))) {
            com.bumptech.glide.Glide.with(imageView.getContext()).load(fileReference).asBitmap().centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL).into(createBitmapImageViewTarget(imageView));
        }
    }
}