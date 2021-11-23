private android.graphics.Bitmap readImage(java.lang.String imageName) {
    java.lang.String imageFullPath = ((((mFlashDir) + "/") + (mFlashName)) + "/") + imageName;
    byte[] bytes = getData(imageFullPath, com.flashanimation.view.FlashDataParser.DataType.BYTES).bytes;
    android.graphics.Bitmap bitmap = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    return bitmap;
}