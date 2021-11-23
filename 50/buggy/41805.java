void loadSites() {
    if (mIsTaskRunning) {
        org.wordpress.android.util.AppLog.w(AppLog.T.UTILS, "site picker > already loading sites");
    }else {
        new org.wordpress.android.ui.main.SitePickerAdapter.LoadSitesTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}