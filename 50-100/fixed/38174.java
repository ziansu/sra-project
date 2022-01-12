public static android.graphics.Bitmap getBitmapFromUrl(android.content.Context context, java.lang.String imageUrl, int readTimeOut, java.util.Map<java.lang.String, java.lang.String> requestProperties) {
    java.io.InputStream stream = cn.trinea.android.common.util.ImageUtils.getInputStreamFromUrl(context, imageUrl, readTimeOut, requestProperties);
    android.graphics.Bitmap b = android.graphics.BitmapFactory.decodeStream(stream);
    cn.trinea.android.common.util.ImageUtils.closeInputStream(stream);
    return b;
}