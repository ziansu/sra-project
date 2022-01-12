@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    state = agersant.polaris.PolarisMediaPlayer.State.PREPARED;
    player.start();
    state = agersant.polaris.PolarisMediaPlayer.State.STARTED;
    if ((seekTarget) != null) {
        seekTo(seekTarget);
        seekTarget = null;
    }
    if (pause) {
        pause();
    }
}