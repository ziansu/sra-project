@java.lang.Override
public void onTrackPositionChanged(int position) {
    mLyricView.updateCurrentTime((position * 1000));
}