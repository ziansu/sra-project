@java.lang.Override
public void refreshData() {
    for (fr.vpm.audiorss.rss.RSSChannel feed : feeds) {
        fr.vpm.audiorss.http.SaveFeedCallback callback = new fr.vpm.audiorss.http.SaveFeedCallback(progressListener, this);
        new fr.vpm.audiorss.http.AsyncFeedRefresh(getContext(), callback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, feed.getUrl());
        (savingFeeds)++;
    }
}