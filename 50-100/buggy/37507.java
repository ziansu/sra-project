@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser) {
        android.util.Log.d("Progress", java.lang.String.valueOf(progress));
        float newVolume = ((float) (progress)) / 100;
        android.util.Log.d("New vol", java.lang.String.valueOf(newVolume));
        this.player.setVolumeForSound(((java.lang.String) (seekBar.getTag())), newVolume);
    }
}