private void createPhoto() throws org.json.JSONException {
    java.lang.String imageString;
    if ((getJsonString()) == null) {
        imageString = getDummyHexStringForPhoto();
    }else {
        imageString = new org.json.JSONObject(getJsonString()).getString("photo");
    }
    if (imageString != null) {
        android.graphics.Bitmap b = co.celloscope.printingdemo.MainActivity.createImageFromString(imageString);
        co.celloscope.printingdemo.FileHelper.saveBitmapFileToExternalCacheDirectory(this, b, "photo.png");
    }
}