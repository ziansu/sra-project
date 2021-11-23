private int getUpdatePeriod() {
    if (((getView()) == null) || ((mPlaybackControlsRow.getTotalTime()) <= 0)) {
        return com.example.android.tvleanback.ui.PlaybackOverlayFragment.DEFAULT_UPDATE_PERIOD;
    }
    return java.lang.Math.max(com.example.android.tvleanback.ui.PlaybackOverlayFragment.UPDATE_PERIOD, ((mPlaybackControlsRow.getTotalTime()) / (getView().getWidth())));
}