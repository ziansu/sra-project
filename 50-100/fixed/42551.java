public synchronized boolean eatenApple(common.snake.Apple apple) {
    if (((x.get(0)) == (apple.x)) && ((y.get(0)) == (apple.y))) {
        (snakeLength)++;
        return true;
    }
    return false;
}