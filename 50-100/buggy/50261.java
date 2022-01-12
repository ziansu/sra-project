@java.lang.Override
protected java.util.ArrayList<pw.vhome.android.sonarr.dataobj.Episode> doInBackground(java.net.URL... params) {
    java.net.URL searchUrl = params[0];
    java.lang.String apiSearchResults = null;
    try {
        apiSearchResults = pw.vhome.android.sonarr.util.HttpHandler.getResponseFromHttpUrl(searchUrl);
        android.util.Log.v(pw.vhome.android.sonarr.util.JsonHandler.TAG, ("HTTP response: " + apiSearchResults));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return pw.vhome.android.sonarr.util.JsonBuilder.getArray(apiSearchResults);
}