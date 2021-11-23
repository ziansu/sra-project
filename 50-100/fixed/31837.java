public void check(@android.support.annotation.NonNull
org.wikipedia.Site site) throws java.io.IOException {
    if (!(success(options))) {
        if (badToken()) {
            org.wikipedia.useroption.dataclient.DefaultUserOptionDataClient.app().getEditTokenStorage().token(site, null);
        }
        throw new java.io.IOException(((("Bad response for site " + (site.host())) + " = ") + (result())));
    }
}