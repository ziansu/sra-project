public static android.graphics.Bitmap getBitmapFromBytes(byte[] image) {
    android.graphics.Bitmap decodedImage = null;
    if (image != null) {
        java.io.ByteArrayInputStream imageStream = new java.io.ByteArrayInputStream(image);
        decodedImage = android.graphics.BitmapFactory.decodeStream(imageStream);
    }
    return decodedImage;
}