@java.lang.Override
public void onClick(android.view.View v) {
    de.xikolo.util.PlaybackSpeed oldSpeed = currentPlaybackSpeed;
    togglePlaybackSpeed();
    de.xikolo.util.LanalyticsUtil.trackVideoChangeSpeed(videoItemDetails.id, course.id, module.id, mediaPlayer.getCurrentPosition(), oldSpeed.getSpeed(), currentPlaybackSpeed.getSpeed(), activity.getResources().getConfiguration().orientation, getQualityString(), getSourceString());
}