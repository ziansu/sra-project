public void createSnake() {
    int x = 15;
    int y = 30;
    for (int i = 0, j = y; i <= (snakeLen); i++ , j++) {
        matrix[x][j].setBackground(snakeColor);
        snake.add(((x + ",") + j));
    }
    direction = "Left";
    len = (snake.size()) / 2;
    instanceGame.updateLenght(len);
}