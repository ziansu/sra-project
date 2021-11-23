private static void initializeGame() {
    boydjohnson.SnakeGame.xSquares = (boydjohnson.SnakeGame.xPixelMaxDimension) / (boydjohnson.SnakeGame.squareSize);
    boydjohnson.SnakeGame.ySquares = (boydjohnson.SnakeGame.yPixelMaxDimension) / (boydjohnson.SnakeGame.squareSize);
    boydjohnson.SnakeGame.snake = new boydjohnson.Snake(boydjohnson.SnakeGame.xSquares, boydjohnson.SnakeGame.ySquares, boydjohnson.SnakeGame.squareSize);
    boydjohnson.SnakeGame.kibble = new boydjohnson.Kibble(boydjohnson.SnakeGame.snake);
    boydjohnson.SnakeGame.score = new boydjohnson.Score();
}