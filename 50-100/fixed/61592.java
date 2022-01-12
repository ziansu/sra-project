private void startGame() {
    this.snakeLen = 4;
    this.foodInMemory = 0;
    this.score = 0;
    this.foodInBonus = new java.util.ArrayList<>();
    this.snake = new java.util.ArrayList<>();
    this.snakeColor = java.awt.Color.white;
    this.bonus = false;
    this.lose = false;
    this.win = false;
    createSnake();
    createFood();
}