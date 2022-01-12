private void move() {
    snake.move();
    main.java.Game.stepCounter = java.lang.Math.max(1, ((main.java.Game.stepCounter) - 1));
    if (snake.eat()) {
        updateScore();
        food.move();
        main.java.Game.stepCounter = getShortestDistance();
    }
    if (snake.collision())
        gameOver();
    
}