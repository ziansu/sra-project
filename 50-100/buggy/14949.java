private void handleEditorClosed() {
    mEditorChanges.clear();
    mEditorEventBindings.clear();
    mSnapshot = null;
    if (com.mixpanel.android.mpmetrics.MPConfig.DEBUG) {
        android.util.Log.v(com.mixpanel.android.viewcrawler.ViewCrawler.LOGTAG, "Editor closed- freeing snapshot");
    }
    applyVariantsAndEventBindings();
    for (final java.lang.String assetUrl : mEditorAssetUrls) {
        mImageStore.deleteStorage(assetUrl);
    }
}