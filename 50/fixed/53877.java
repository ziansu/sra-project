private android.net.Uri appendTestParam(android.net.Uri uri) {
    return org.mozilla.gecko.background.db.DelegatingTestContentProvider.appendUriParam(uri, BrowserContract.PARAM_IS_TEST, "1");
}