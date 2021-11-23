private boolean checkBorder(int x, int y) {
    if ((((x >= 0) && (x <= (com.snake.Game.sizeByX))) && (y >= 0)) && (y <= (com.snake.Game.sizeByY))) {
        return true;
    }
    return false;
}