public boolean isInSnake(com.linkui.snake.Egg e) {
    int eggRow = e.getRow();
    int eggCol = e.getCol();
    for (com.linkui.snake.Snake.Node n = head; n != null; n = n.next) {
        if ((eggRow == (n.rows)) && (eggCol == (n.cols))) {
            return true;
        }
    }
    return false;
}