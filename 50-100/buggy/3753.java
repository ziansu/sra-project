public void playerMove() {
    if (((playerLocation) + (Board.MOVESPEED)) >= (Board.BOARDSIZE)) {
        setupLevel();
    }else
        if ((squares[((playerLocation) + (Board.MOVESPEED))].isOccupied) == false) {
            squares[playerLocation].moveContents(squares[((playerLocation) + (Board.MOVESPEED))]);
            playerLocation += Board.MOVESPEED;
        }
    
}