@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp1) {
    loaderStop();
    audioState = pl.cprojekt.cpaudiopreview.CPAudio.AUDIO_STATE.PREPARED;
    showPlay();
    duration = mp.getDuration();
    if (!(firstPrepared)) {
        play();
    }
    firstPrepared = false;
    if (isAutoPlay) {
        play();
    }
}