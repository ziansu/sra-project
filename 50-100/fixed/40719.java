public static java.lang.String encodeTobase64(android.graphics.Bitmap image) {
    android.graphics.Bitmap immagex = image;
    java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
    immagex.compress(Bitmap.CompressFormat.JPEG, 100, baos);
    byte[] b = baos.toByteArray();
    java.lang.String imageEncoded = android.util.Base64.encodeToString(b, Base64.DEFAULT);
    return imageEncoded;
}