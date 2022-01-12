public static android.graphics.drawable.Drawable getDrawableFromUrl(android.content.Context context, java.lang.String imageUrl, int readTimeOutMillis, java.util.Map<java.lang.String, java.lang.String> requestProperties) {
    java.io.InputStream stream = cn.trinea.android.common.util.ImageUtils.getInputStreamFromUrl(context, imageUrl, readTimeOutMillis, requestProperties);
    android.graphics.drawable.Drawable d = android.graphics.drawable.Drawable.createFromStream(stream, "src");
    cn.trinea.android.common.util.ImageUtils.closeInputStream(stream);
    return d;
}