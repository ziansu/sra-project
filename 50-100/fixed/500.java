public synchronized void setEpisodeId(long argId) {
    this.mEpisodeId = argId;
    org.bottiger.podcast.listeners.PaletteObservable.registerListener(this);
    long offset = ((getEpisode().offset) > 0) ? getEpisode().offset : 0;
    setProgressMs(offset);
    invalidate();
}