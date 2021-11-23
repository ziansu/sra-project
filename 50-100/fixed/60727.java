private android.graphics.Bitmap downLoadBitmap(java.lang.String uri) {
    android.graphics.Bitmap bitmap;
    java.io.InputStream is;
    try {
        is = GetImageByUrl(uri);
        bitmap = android.graphics.BitmapFactory.decodeStream(is);
        is.close();
        return bitmap;
    } catch (java.net.MalformedURLException e) {
    } catch (java.io.IOException e) {
    } catch (java.lang.NullPointerException e) {
    }
    return null;
}