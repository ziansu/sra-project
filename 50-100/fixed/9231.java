void initVariables(int mapNumber, java.lang.String ballColor, boolean gameStarted) {
    inGame = gameStarted;
    paused = false;
    map = new Map(mapNumber);
    ball = new Ball(ballColor);
    timer = new javax.swing.Timer(10, this);
    timer.start();
    watch = new StopWatch();
    if (inGame) {
        watch.start();
    }
}