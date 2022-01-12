public void moveDown() {
    if (((!(board.questionCollision(xPosition, ((yPosition) + 1), elevation))) && (wallCollide)) && (!(questionPlayerCollision(0, 1))))
        (yPosition)++;
    
    questionNonWalls();
    lastPosition[1] = yPosition;
}