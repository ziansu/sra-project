@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String oldQuality = getQualityString();
    java.lang.String oldSource = getSourceString();
    int position = getCurrentPosition();
    toggleHdButton();
    de.xikolo.util.LanalyticsUtil.trackVideoChangeQuality(videoItemDetails.id, course.id, module.id, position, currentPlaybackSpeed.getSpeed(), activity.getResources().getConfiguration().orientation, oldQuality, getQualityString(), oldSource, getSourceString());
}