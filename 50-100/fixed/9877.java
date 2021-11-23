private void refreshContent() {
    thestral.agc.events.EventDownloadTask eventDownloadTask = new thestral.agc.events.EventDownloadTask(getActivity(), true);
    thestral.agc.BackgroundDownloader backgroundDownloader = new thestral.agc.BackgroundDownloader(getActivity());
    backgroundDownloader.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, eventDownloadTask);
    updateContent();
    this.swipeRefreshLayout.setRefreshing(false);
}