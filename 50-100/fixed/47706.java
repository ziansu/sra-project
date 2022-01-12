private void reset() {
    started = false;
    lost = false;
    won = false;
    backgroundMusic.stop();
    defeatMusic.stop();
    victoryMusic.stop();
    coverMusic.loop();
    spawn.destruct();
    p.destruct();
    p = new Player();
    spawn = new SpawnTracker(p);
}