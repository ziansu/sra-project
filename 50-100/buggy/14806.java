private android.graphics.Bitmap downloadImage(java.lang.String url) {
    android.graphics.Bitmap bitmap = null;
    java.io.InputStream stream = null;
    android.graphics.BitmapFactory.Options bmOptions = new android.graphics.BitmapFactory.Options();
    bmOptions.inSampleSize = 1;
    try {
        stream = getHttpConnection(url);
        bitmap = android.graphics.BitmapFactory.decodeStream(stream, null, bmOptions);
        stream.close();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
    return bitmap;
}