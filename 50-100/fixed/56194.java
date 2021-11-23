@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if ((currentTime) == (song.getSongDuration())) {
    }else {
        currentTime = seekBar.getProgress();
        currentTxt.setText(com.example.kyler.musicplayer.Utils.Helper.millisecondsToTimer(currentTime));
    }
}