private boolean urlInHashSet(java.net.URL url, java.util.HashSet<java.lang.String> set) {
    boolean returnBoolean = false;
    for (java.lang.String setItem : set) {
        if (com.wordpress.httpspandareaktor.scrapetest.NetworkUtils.urlHostPathMatch(com.wordpress.httpspandareaktor.scrapetest.NetworkUtils.makeURL(setItem), url)) {
            android.util.Log.v("DLAsync.urlInHashSet", (((" just found " + (url.toString())) + " in ") + (set.toString())));
            returnBoolean = true;
        }
    }
    return returnBoolean;
}