@java.lang.Override
protected android.graphics.drawable.Drawable doInBackground(java.lang.String... uri) {
    java.io.InputStream is = null;
    try {
        is = ((java.io.InputStream) (new java.net.URL(uri[0]).getContent()));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } finally {
        try {
            is.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
    return android.graphics.drawable.Drawable.createFromStream(is, null);
}