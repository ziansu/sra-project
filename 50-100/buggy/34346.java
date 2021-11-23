@java.lang.Override
public void run() {
    setGameState();
    while (isRunning()) {
        long start = java.lang.System.currentTimeMillis();
        moveBall();
        handleCollisions();
        state.endTick();
        long elapsed = start - (java.lang.System.currentTimeMillis());
        try {
            java.lang.Thread.sleep(((programming.breakout.engine.Engine.REFRESH_RATE) - elapsed));
        } catch (java.lang.InterruptedException ex) {
        }
    } 
    this.ball = createBall();
    run();
    state.setGameOver(true);
}