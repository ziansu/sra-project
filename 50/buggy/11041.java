public void pause() {
    if (!(paused)) {
        for (Game.Control.Sound.Sound sound : sounds) {
            sound.pauseSound();
        }
    }
}