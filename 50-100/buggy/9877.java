private void refreshContent() {
    android.support.v4.widget.SwipeRefreshLayout swipeRefreshLayout = ((android.support.v4.widget.SwipeRefreshLayout) (getActivity().findViewById(R.id.event_swipe_layout)));
    thestral.agc.events.EventDownloadTask eventDownloadTask = new thestral.agc.events.EventDownloadTask(getActivity(), true);
    thestral.agc.BackgroundDownloader backgroundDownloader = new thestral.agc.BackgroundDownloader(getActivity());
    backgroundDownloader.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, eventDownloadTask);
    updateContent();
    swipeRefreshLayout.setRefreshing(false);
}