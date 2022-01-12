private void moveSnake() {
    java.awt.Point newHeadPos = getPositionAfterMovement(direction, new java.awt.Point(head.column, head.row));
    if (isAppleOnPosition(newHeadPos)) {
        eatApple();
    }
    head.column = newHeadPos.x;
    head.row = newHeadPos.y;
    moveSnakeSteply();
}