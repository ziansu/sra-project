public void startAction() {
    clearWall();
    shape = xtq.game.tetris.BaseShape.randShape();
    nextShape = xtq.game.tetris.BaseShape.randShape();
    lines = 0;
    score = 0;
    pause = false;
    gameOver = false;
    timer = new java.util.Timer();
    timer.schedule(new java.util.TimerTask() {
        public void run() {
            softDropAction();
            java.lang.System.out.println("Running");
            repaint();
        }
    }, 700, 700);
}