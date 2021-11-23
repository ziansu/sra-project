@java.lang.Override
public void onProgressChanged(android.widget.SeekBar s, int progress, boolean fromUser) {
    if (((mediaPlayer) != null) && fromUser) {
        mediaPlayer.seekTo(progress);
        if (((!(isPausePressed)) && (!(isPlayPressed))) && (!(isStopPressed))) {
            play(getView());
        }
    }
}