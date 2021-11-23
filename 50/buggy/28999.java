private void takePicture() {
    android.content.Intent gallery = new android.content.Intent(android.content.Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    if ((gallery.resolveActivity(getPackageManager())) != null) {
        startActivityForResult(gallery, 1);
    }
}