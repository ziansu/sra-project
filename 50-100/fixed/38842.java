@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser) {
        videoView.seekTo(progress);
        currentProgress = progress;
    }else {
    }
    seekPositionDisplay.setText(java.lang.String.format(resources.getString(R.string.seekDisplayEditCard), (((float) (progress)) / 1000.0F)));
}