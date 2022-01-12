private void setImage() {
    android.content.ContentResolver cr = getContentResolver();
    android.graphics.Bitmap bitmap;
    try {
        bitmap = MediaStore.Images.Media.getBitmap(cr, imageUri);
        itemImage.setImageBitmap(bitmap);
        android.widget.Toast.makeText(this, "Image taken", Toast.LENGTH_SHORT).show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}