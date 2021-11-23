public void savePreviewSetting(android.graphics.Bitmap preview) {
    previewImageNavDrawIV.setImageBitmap(preview);
    java.io.ByteArrayOutputStream stream = new java.io.ByteArrayOutputStream();
    preview.compress(Bitmap.CompressFormat.PNG, 100, stream);
    byte[] byteArray = stream.toByteArray();
    java.lang.String strByteArrBackImage = android.util.Base64.encodeToString(byteArray, Base64.DEFAULT);
    editPref.putInt("blur_value", blurValue);
    editPref.putString("nav_back_preview", strByteArrBackImage);
    editPref.apply();
}