@java.lang.Override
protected android.graphics.Movie doInBackground(java.lang.String... strings) {
    java.net.URL url;
    java.io.InputStream is = null;
    android.graphics.Movie movie = null;
    java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
    try {
        url = new java.net.URL(strings[0]);
        is = url.openStream();
        movie = android.graphics.Movie.decodeStream(is);
        is.close();
    } catch (java.io.IOException e) {
        java.lang.System.err.printf("Failed while reading bytes from url: %s", e.getMessage());
        e.printStackTrace();
    }
    return movie;
}