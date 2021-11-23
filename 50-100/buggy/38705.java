protected void populateImageView(java.lang.String fileReference, android.widget.ImageView imageView) {
    if (imageView != null) {
        if ((fileReference != null) && (!(fileReference.isEmpty()))) {
            com.google.firebase.storage.StorageReference storageReference = mStorageRef.child(fileReference);
            com.bumptech.glide.Glide.with(imageView.getContext()).using(mImageLoader).load(storageReference).fitCenter().diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        }
    }
}