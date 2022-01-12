private void initImageSourceBtns() {
    final android.widget.ImageButton photoBtn = ((android.widget.ImageButton) (findViewById(R.id.photo_btn)));
    final android.widget.ImageButton galleryBtn = ((android.widget.ImageButton) (findViewById(R.id.gallery_btn)));
    equalizeSides(photoBtn);
    equalizeSides(galleryBtn);
    photoBtn.setOnClickListener(this);
    galleryBtn.setOnClickListener(this);
}