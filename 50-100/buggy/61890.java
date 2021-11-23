public void onPageLoaded() {
    com.lorepo.icplayer.client.PlayerEntryPoint.firePageLoaded(pageLoadedListener);
    int currentPageIndex = theApplication.getPlayerServices().getCurrentPageIndex();
    java.lang.String source = java.lang.Integer.toString((currentPageIndex + 1));
    com.lorepo.icplayer.client.PlayerEntryPoint.fireStatusChanged(statusChangedListener, "PageLoaded", source, "");
}