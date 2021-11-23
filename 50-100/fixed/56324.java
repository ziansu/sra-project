private android.graphics.Bitmap getBitmapFromURL(java.lang.String src) {
    try {
        java.net.URL url = new java.net.URL(src);
        java.net.HttpURLConnection connection = ((java.net.HttpURLConnection) (url.openConnection()));
        connection.setDoInput(true);
        connection.connect();
        java.io.InputStream input = connection.getInputStream();
        return android.graphics.BitmapFactory.decodeStream(input);
    } catch (java.lang.Exception ex) {
    }
    return null;
}