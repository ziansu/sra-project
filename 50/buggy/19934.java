public synchronized void pause() {
    while (game.Game.isGamePaused) {
        render();
        java.lang.Thread.yield();
    } 
}