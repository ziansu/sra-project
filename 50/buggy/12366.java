public void pause() {
    mediaPlayer.pause();
    state = edu.calpoly.idulkin.podcrust.MediaPlayerService.MP_STATE.PAUSED;
    android.util.Log.e("Media Player Service", ("State: " + (getState())));
}