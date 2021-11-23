@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (!(com.hungnt.customlogin.fragments.MusicPlayerFragment.isPlaying)) {
        seekTime();
    }
}