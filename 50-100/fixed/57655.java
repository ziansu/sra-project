private void onSongsChanged() {
    final long atRevision = revision;
    final boolean shouldFastForward = shouldFastForward();
    for (final github.daneren2005.dsub.service.DownloadService.OnSongChangedListener listener : onSongChangedListeners) {
        handler.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                if (((revision) == atRevision) && ((github.daneren2005.dsub.service.DownloadService.instance) != null)) {
                    listener.onSongsChanged(downloadList, currentPlaying, currentPlayingIndex, shouldFastForward);
                }
            }
        });
    }
}