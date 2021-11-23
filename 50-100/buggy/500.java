public synchronized void setEpisodeId(long argId) {
    this.mEpisodeId = argId;
    org.bottiger.podcast.listeners.PaletteObservable.registerListener(this);
    if ((getEpisode().offset) > 0) {
        setProgressMs(getEpisode().offset);
        invalidate();
    }
}