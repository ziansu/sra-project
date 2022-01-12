@com.google.appinventor.components.annotations.SimpleFunction
public void Stop() {
    if ((com.google.appinventor.components.runtime.Player.audioFocusSupported) && (focusOn)) {
        abandonFocus();
    }
    if ((((playerState) == (com.google.appinventor.components.runtime.Player.State.PLAYING)) || ((playerState) == (com.google.appinventor.components.runtime.Player.State.PAUSED_BY_USER))) || ((playerState) == (com.google.appinventor.components.runtime.Player.State.PAUSED_BY_EVENT))) {
        player.stop();
        prepare();
        if ((player) != null) {
            player.seekTo(0);
        }
    }
}