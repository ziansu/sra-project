@java.lang.Override
public void setElapsedTime(int elapsedTime) {
    trackPosition = position;
    seekBar.setProgress(trackPosition);
    elapsedTime_tv.setText(getDurationInMinutes(trackPosition));
    refreshScreen();
}