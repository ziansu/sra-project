public void moveLeft() {
    if (((!(board.questionCollision(((xPosition) - 1), yPosition, elevation))) && (wallCollide)) && (!(questionPlayerCollision((-1), 0))))
        (xPosition)--;
    
    questionNonWalls();
    lastPosition[0] = xPosition;
}