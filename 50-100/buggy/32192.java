@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    de.xikolo.util.LanalyticsUtil.trackVideoSeek(videoItemDetails.id, course.id, module.id, mediaPlayer.getCurrentPosition(), progress, currentPlaybackSpeed.getSpeed(), activity.getResources().getConfiguration().orientation, getQualityString(), getSourceString());
    userIsSeeking = false;
    seekTo(progress);
}