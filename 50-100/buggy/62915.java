@java.lang.SuppressWarnings(value = "deprecation")
private void onSelectFromGalleryResult(android.content.Intent data) {
    android.graphics.Bitmap bm = null;
    if (data != null) {
        try {
            bm = MediaStore.Images.Media.getBitmap(getApplicationContext().getContentResolver(), data.getData());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    bm = se.sugarest.jane.ursviksinventory.EditorActivity.scaleImage(bm);
    mPictureImageView.setImageBitmap(bm);
    mPictureImageView.setImageBitmap(bm);
}