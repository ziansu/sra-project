private android.graphics.Bitmap insertPhoto(android.graphics.Bitmap photo) {
    if (photo == null)
        return null;
    
    int height = (photo.getHeight()) / 2;
    int width = (photo.getWidth()) / 2;
    return android.graphics.Bitmap.createScaledBitmap(photo, width, height, false);
}