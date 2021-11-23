private void insertPhoto(android.graphics.Bitmap photo, android.widget.ImageView imageView) {
    if (photo == null)
        return ;
    
    int height = (photo.getHeight()) / 2;
    int width = (photo.getWidth()) / 2;
    android.graphics.Bitmap scaledBitmap = android.graphics.Bitmap.createScaledBitmap(photo, width, height, false);
    imageView.setImageBitmap(scaledBitmap);
}