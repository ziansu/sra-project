public void initGame() {
    renderThread = new java.lang.Thread(new spaceGame.Game.GameRender());
    logicThread = new java.lang.Thread(new spaceGame.Game.GameLogic());
    initSpaceShips();
    inGame = true;
    logicThread.start();
    renderThread.start();
    nextTimeSlice = (java.lang.System.currentTimeMillis()) + (spaceGame.Game.timeSliceDuration);
    lastTime = java.lang.System.nanoTime();
}