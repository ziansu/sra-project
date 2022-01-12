public void reAppear() {
    this.row = (com.linkui.snake.Egg.r.nextInt(((Yard.ROWS) - 2))) + 2;
    this.col = (com.linkui.snake.Egg.r.nextInt(((Yard.COLUMNS) - 2))) + 2;
    if (s.isInSnake(this)) {
        this.reAppear();
    }
}