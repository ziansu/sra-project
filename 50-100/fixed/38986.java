private void displayGameOver(javafx.scene.layout.GridPane grid, javafx.animation.AnimationTimer timer) {
    gameOverText = new javafx.scene.text.Text("Game Over");
    styleTextBottom(gameOverText);
    grid.add(gameOverText, 0, TetrisBoard.NUM_ROWS, tetris.TetrisGame.BOTTOM_SPAN, tetris.TetrisGame.BOTTOM_SPAN);
    gameOver = true;
    timer.stop();
}