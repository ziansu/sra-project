private void showImagePreview(boolean show) {
    if (show) {
        containerImage.setVisibility(View.VISIBLE);
        com.bumptech.glide.Glide.with(getApplicationContext()).load(photoFile.toString()).centerCrop().into(previewImage);
    }
}