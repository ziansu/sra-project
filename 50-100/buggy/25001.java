private void updateTrackTime() {
    if ((mediaPlayerServiceBinder) == null)
        return ;
    
    int seconds = mediaPlayerServiceBinder.getCurrentPosition();
    reloadUIElements();
    positionTextView.setText(millisecondsToMinutesAndSeconds(seconds));
    float percentCurrentPosition = (((float) (seconds)) / (trackDuration)) * 100;
    seekBarImageView.setX(((percentCurrentPosition - 100) * (pxPerWidthPercentage)));
}