@java.lang.Override
public void setElapsedTime(int elapsedTime) {
    trackPosition = elapsedTime;
    seekBar.setProgress(trackPosition);
    elapsedTime_tv.setText(getDurationInMinutes(trackPosition));
    refreshScreen();
}