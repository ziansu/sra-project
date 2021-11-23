public synchronized boolean eatenApple(common.snake.Apple apple) {
    if (((x[0]) == (apple.x)) && ((y[0]) == (apple.y))) {
        (snakeLength)++;
        return true;
    }
    return false;
}