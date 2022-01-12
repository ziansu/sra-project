public void resume() {
    paused = false;
    alSourcePlay(srcNames);
}