public static void storeImage(android.graphics.Bitmap image, java.lang.String saveFilePath) throws java.io.IOException {
    java.io.FileOutputStream fos = new java.io.FileOutputStream(saveFilePath);
    image.compress(Bitmap.CompressFormat.PNG, 70, fos);
    fos.close();
    org.unicef.rapidreg.utils.ImageCompressUtil.recycleBitmap(image);
}