public void loadPhoto(java.lang.String photoPath) {
    android.graphics.Bitmap image = android.graphics.BitmapFactory.decodeFile(photoPath);
    image = android.graphics.Bitmap.createScaledBitmap(image, 100, 100, true);
    this.photoPathField.setImageBitmap(image);
    this.photoPathField.setScaleType(ImageView.ScaleType.FIT_XY);
    this.photoPathField.setTag(photoPath);
}