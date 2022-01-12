public void stepInSpace(int x, int y) {
    square[x][y].click();
    if (!(square[x][y].getFlagged())) {
        if (square[x][y].getBomb()) {
            java.lang.System.out.println("game over");
        }else {
            checkAdjacentBombs(square[x][y]);
            java.lang.System.out.println(("AdjacentBombs = " + (square[x][y].getAdjacentBombs())));
        }
    }
}