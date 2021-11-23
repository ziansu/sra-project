@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser) {
        float newVolume = ((float) (progress)) / 100;
        this.player.setVolumeForSound(((java.lang.String) (seekBar.getTag())), newVolume);
    }
}