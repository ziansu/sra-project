private void initImageSourceBtns() {
    final android.widget.ImageButton photoBtn = ((android.widget.ImageButton) (findViewById(R.id.photo_btn)));
    final android.widget.ImageButton galleryBtn = ((android.widget.ImageButton) (findViewById(R.id.gallery_btn)));
    equalizeSides(photoBtn);
    equalizeSides(galleryBtn);
    photoBtn.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            startBuildInCameraActivity();
        }
    });
    galleryBtn.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            startGalleryChooser();
        }
    });
}