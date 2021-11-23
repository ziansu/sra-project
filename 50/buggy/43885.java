@java.lang.Override
public void onTrackPositionChanged(int position) {
    android.util.Log.d(io.nya.powerlyrics.LyricsActivity.LOG_TAG, ("play position: " + (position * 1000)));
    mLyricView.updateCurrentTime((position * 1000));
}