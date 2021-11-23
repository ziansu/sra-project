private java.lang.StringBuilder getItem(java.lang.String url) {
    java.lang.StringBuilder toReturn = null;
    try {
        toReturn = com.jtmcn.archwiki.viewer.utils.NetworkUtils.fetchURL(url);
    } catch (java.io.IOException e) {
        android.util.Log.w(com.jtmcn.archwiki.viewer.tasks.FetchUrl.TAG, ("Could not connect to: " + url), e);
    }
    return toReturn;
}