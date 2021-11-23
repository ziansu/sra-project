private void setImage() {
    android.content.ContentResolver cr = getContentResolver();
    android.graphics.Bitmap bitmap;
    try {
        bitmap = MediaStore.Images.Media.getBitmap(cr, imageUri);
        itemImage.setImageBitmap(bitmap);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}