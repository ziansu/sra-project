@android.support.annotation.UiThread
@java.lang.Override
protected void onPreExecute() {
    final android.content.Context context = this.contextWeakReference.get();
    if (context != null) {
        final org.cyanogenmod.changelog.ChangelogActivity changelogActivity = ((org.cyanogenmod.changelog.ChangelogActivity) (contextWeakReference.get()));
        changelogActivity.mSwipeRefreshLayout.setRefreshing(true);
    }
}