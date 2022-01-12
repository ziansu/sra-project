public static synchronized void loadMozGlue(final android.content.Context context) {
    if (org.mozilla.gecko.mozglue.GeckoLoader.sMozGlueLoaded) {
        return ;
    }
    org.mozilla.gecko.mozglue.GeckoLoader.doLoadLibrary(context, "mozglue");
    org.mozilla.gecko.mozglue.GeckoLoader.sMozGlueLoaded = true;
}