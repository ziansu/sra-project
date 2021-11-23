@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    int progress = (seekBar.getProgress()) * 1000;
    seekTo(progress);
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoLayout.TAG, "onStopTrackingTouch");
}