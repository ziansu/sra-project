public void destroy() {
    android.util.Log.d(((libraries.inlacou.com.imagegetter.ImageGetter.DEBUG_TAG) + ".destroy"), "deleteing... ");
    try {
        android.util.Log.d(((libraries.inlacou.com.imagegetter.ImageGetter.DEBUG_TAG) + ".destroy"), ("deleteing... " + (uri.getPath())));
        new java.io.File(uri.getPath()).delete();
    } catch (java.lang.NullPointerException npe) {
        android.util.Log.d(((libraries.inlacou.com.imagegetter.ImageGetter.DEBUG_TAG) + ".destroy"), "nothing!");
    }
}