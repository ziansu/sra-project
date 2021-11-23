public void check(@android.support.annotation.NonNull
org.wikipedia.Site site) {
    if (!(success(options))) {
        if (badToken()) {
            org.wikipedia.useroption.dataclient.DefaultUserOptionDataClient.app().getEditTokenStorage().token(site, null);
        }
        throw org.wikipedia.dataclient.retrofit.RetrofitException.unexpectedError(new java.lang.RuntimeException(((("Bad response for site " + (site.host())) + " = ") + (result()))));
    }
}