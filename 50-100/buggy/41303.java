private void onStateUpdate() {
    final long atRevision = revision;
    synchronized(onSongChangedListeners) {
        for (final github.daneren2005.dsub.service.DownloadService.OnSongChangedListener listener : onSongChangedListeners) {
            handler.post(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    if (((revision) == atRevision) && ((github.daneren2005.dsub.service.DownloadService.instance) != null)) {
                        listener.onStateUpdate(currentPlaying, playerState);
                    }
                }
            });
        }
    }
}