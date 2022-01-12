private boolean validateState() {
    if ((mEpisode) == null) {
        if (org.bottiger.podcast.BuildConfig.DEBUG) {
            return false;
        }else {
            return false;
        }
    }
    if ((mOverlay) == null) {
        if (org.bottiger.podcast.BuildConfig.DEBUG) {
            throw new java.lang.IllegalStateException("Overlay needs to be set");
        }else {
            return false;
        }
    }
    return true;
}