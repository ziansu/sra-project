private void updatePosition(int position) {
    this.position = position;
    if (!(isPositionBarTouched)) {
        positionBar.setProgress(position);
        positionBar.setEnabled(true);
        positionDisplay.setText(com.lenworthrose.music.util.Utils.longToTimeDisplay(position));
    }
}