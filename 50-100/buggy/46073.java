private void picsToString2() {
    android.graphics.Bitmap bmp2 = android.graphics.Bitmap.createBitmap(bMapScaled2);
    java.io.ByteArrayOutputStream bYtE2 = new java.io.ByteArrayOutputStream();
    bmp2.compress(Bitmap.CompressFormat.JPEG, 25, bYtE2);
    bmp2.recycle();
    byte[] byteArray2 = bYtE2.toByteArray();
    imageFile2 = android.util.Base64.encodeToString(byteArray2, Base64.DEFAULT);
}