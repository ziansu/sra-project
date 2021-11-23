@java.lang.Override
public void setTrackDuration(int duration) {
    trackDuration = duration;
    seekBar.setMax(duration);
    if (isAdded())
        trackDuration_tv.setText(getDurationInMinutes(duration));
    
}