protected void populateCircularImageView(com.google.firebase.storage.StorageReference storageReference, final android.widget.ImageView imageView) {
    if (imageView != null) {
        if (storageReference != null) {
            com.bumptech.glide.Glide.with(imageView.getContext()).using(mImageLoader).load(storageReference).asBitmap().centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL).into(createBitmapImageViewTarget(imageView));
        }
    }
}