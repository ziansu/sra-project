public void initGame() {
    renderThread = new java.lang.Thread(new spaceGame.Game.GameRender());
    logicThread = new java.lang.Thread(new spaceGame.Game.GameLogic());
    initSpaceShips();
    logicThread.start();
    renderThread.start();
    inGame = true;
    nextTimeSlice = (java.lang.System.currentTimeMillis()) + (spaceGame.Game.timeSliceDuration);
    lastTime = java.lang.System.nanoTime();
}