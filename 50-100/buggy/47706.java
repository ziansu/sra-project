private void reset() {
    started = false;
    lost = false;
    won = false;
    spawn.destruct();
    backgroundMusic.stop();
    defeatMusic.stop();
    victoryMusic.stop();
    coverMusic.loop();
    p = new Player();
    spawn = new SpawnTracker(p);
}