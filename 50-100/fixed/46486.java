@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((getDuration()) > 1) {
        int time = ((seekBar.getProgress()) * (getDuration())) / (progressMax);
        if ((currentTimeTextView) != null)
            currentTimeTextView.setText(org.song.videoplayer.Util.stringForTime(time));
        
    }
}