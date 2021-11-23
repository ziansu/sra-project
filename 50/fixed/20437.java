public void startGame(int width, int height) {
    ui.gotoGameScreen();
    gameOver = false;
    grid = new tetris.Grid(width, height);
    dropNewTetromino();
    timer.start();
    java.lang.System.out.println("started running");
}