@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    android.util.Log.d("PlayerActivity", ("onProgressChanged:: " + progress));
    seekBar.setProgress(progress);
    trackCurrentTime.setText(formatTime(progress));
    playTrackFrom(progress);
}