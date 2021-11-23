protected android.graphics.Bitmap doInBackground(java.lang.String... urls) {
    java.lang.String urlDisplay = urls[0];
    android.graphics.Bitmap bookCover = null;
    if (urlDisplay == null) {
        return null;
    }
    try {
        java.io.InputStream in = new java.net.URL(urlDisplay).openStream();
        bookCover = android.graphics.BitmapFactory.decodeStream(in);
    } catch (java.lang.Exception e) {
        android.util.Log.e("Error", e.getMessage());
        e.printStackTrace();
    }
    return bookCover;
}