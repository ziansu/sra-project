private void loseSurvival() {
    resetLevel();
    cp.getCurrentAudio().setPaused(true);
    cp.getCurrentAudio().setRestart(true);
    if (cp.isAudioOn()) {
        cp.getCurrentAudio().setPaused(false);
    }
    restart();
}