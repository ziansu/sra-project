public void lowerTetromino(tetris.tetromino.AbstractTetromino tetromino, tetris.Grid grid) {
    if (checkMoveDown(tetromino, grid)) {
        return ;
    }else
        if ((tetromino.top()) >= ((grid.height()) - 1)) {
            controller.gameOver();
        }else {
            grid.registerTetromino(tetromino);
            controller.dropNewTetromino();
        }
    
}