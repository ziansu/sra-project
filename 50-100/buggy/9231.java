public void initVariables(int mapNumber, java.lang.String ballColor, boolean gameStarted) {
    java.lang.System.out.format((((("InitVariables: inGame = " + (inGame)) + ", now setting it to ") + gameStarted) + "\n"));
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