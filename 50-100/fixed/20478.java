public static android.graphics.Bitmap convertByteToBitmap(byte[] image) {
    android.graphics.Bitmap bitmap = null;
    if (image != null) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inMutable = true;
        bitmap = android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length, options);
        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
    }
    return bitmap;
}