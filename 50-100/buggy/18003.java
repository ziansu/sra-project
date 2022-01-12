@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp1) {
    loaderStop();
    android.util.Log.i("X", "________ONPREPARED gotowy do play");
    audioState = pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.PREPARED;
    showPlay();
    duration = mp.getDuration();
    if ((ctrlMode) == (pl.cprojekt.cpaudiopreview.CPAudio.CTRL_MODE.CTRL_PLAY_STOP)) {
        if (!(firstPrepared)) {
            play();
        }
        firstPrepared = false;
    }
    if (isAutoPlay) {
        play();
    }
}