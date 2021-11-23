@java.lang.Override
protected java.lang.String getCategoryPageUrl(final java.lang.String categoryUrl, final int page) {
    return page == 0 ? categoryUrl : ((categoryUrl + "/") + (page * 15)) + "/";
}