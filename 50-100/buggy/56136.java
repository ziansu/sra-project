protected void moveKibble(boydjohnson.Snake s) {
    java.util.Random rng = new java.util.Random();
    boolean kibbleInSnake = true;
    while (kibbleInSnake == true) {
        kibbleX = rng.nextInt(boydjohnson.SnakeGame.getxSquares());
        kibbleY = rng.nextInt(boydjohnson.SnakeGame.getySquares());
        kibbleInSnake = s.isSnakeSegment(kibbleX, kibbleY);
    } 
}