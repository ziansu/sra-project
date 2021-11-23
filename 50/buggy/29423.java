@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    com.charlesdrews.herecomethehawks.MusicService.mPlayer.stop();
    com.charlesdrews.herecomethehawks.MusicService.mPlayer.release();
}