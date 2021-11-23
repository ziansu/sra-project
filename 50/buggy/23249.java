protected void loadPageSync(java.lang.String title, @android.support.annotation.NonNull
org.wikipedia.Site site, @android.support.annotation.NonNull
org.wikipedia.page.PageLoadLatchCallback callback) {
    getFragment().setPageLoadCallbacks(callback);
    loadPage(title, site);
    callback.await();
}