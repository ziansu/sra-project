private void updatePosition() {
    if (!(isPositionBarTouched)) {
        int position = playbackService.getPosition();
        positionBar.setProgress(position);
        positionBar.setEnabled(true);
        positionDisplay.setText(com.lenworthrose.music.util.Utils.longToTimeDisplay(position));
    }
}