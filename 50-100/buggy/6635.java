private void AddFruit() {
    boolean bFlag = true;
    while (bFlag) {
        int x = ((int) ((java.lang.Math.random()) * (com.snake.Game.sizeByX)));
        int y = ((int) ((java.lang.Math.random()) * (com.snake.Game.sizeByY)));
        if ((field[x][y]) == 0) {
            bFlag = false;
            field[x][y] = -2;
        }
    } 
}