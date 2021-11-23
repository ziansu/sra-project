public void onFailure(java.io.IOException e) {
    android.util.Log.w("Download", "Download Failed");
    for (org.bottiger.podcast.service.Downloader.engines.Callback callback : mExternalCallback) {
        callback.downloadInterrupted(mEpisode.getId());
    }
}