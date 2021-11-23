private void takeAPic(android.content.Intent data) {
    android.graphics.Bitmap thumbnail = ((android.graphics.Bitmap) (data.getExtras().get("data")));
    java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
    if (thumbnail != null) {
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        byte[] scaledData = bytes.toByteArray();
        mImageProfile.setImageBitmap(thumbnail);
        saveImgProfile(scaledData);
    }
}