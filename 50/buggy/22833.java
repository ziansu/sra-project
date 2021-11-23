@java.lang.Override
public void pause() {
    state = PAUSE_STATE;
    log.debug("pause()");
    if (createPlayerOnUI)
        waitForPlayer();
    
}