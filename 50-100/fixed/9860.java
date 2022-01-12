public void run() {
    while ((gameRunning) && (!(gameOver))) {
        run_game();
        try {
            java.lang.Thread.sleep(com.se.softwareEngineering.gameEngine.GameEngine.gameSpeed);
        } catch (java.lang.Throwable t) {
            if (com.se.softwareEngineering.gameEngine.GameEngine.debug) {
                java.lang.System.err.println(t);
            }
        }
    } 
    if (gameOver) {
        finish();
    }
}