@java.lang.Override
public void setTrackDuration(int duration) {
    trackDuration = duration;
    seekBar.setMax(trackDuration);
    if (isAdded())
        trackDuration_tv.setText(getDurationInMinutes(trackDuration));
    
}