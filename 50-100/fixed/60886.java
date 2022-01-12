public void destroy(java.lang.String path) {
    android.util.Log.d(((libraries.inlacou.com.imagegetter.ImageGetter.DEBUG_TAG) + ".destroy"), "deleteing... ");
    try {
        android.util.Log.d(((libraries.inlacou.com.imagegetter.ImageGetter.DEBUG_TAG) + ".destroy"), ("deleteing... " + path));
        new java.io.File(uri.getPath()).delete();
    } catch (java.lang.NullPointerException npe) {
        android.util.Log.d(((libraries.inlacou.com.imagegetter.ImageGetter.DEBUG_TAG) + ".destroy"), "nothing!");
    }
}