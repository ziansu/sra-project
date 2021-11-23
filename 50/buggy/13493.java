public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int prevPosition = floorPosition(seekBar.getProgress(), 0);
    musicService.seekTo(prevPosition);
    seekBar.setProgress(prevPosition);
    ignoreSeekBar = false;
}