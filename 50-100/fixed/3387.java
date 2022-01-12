public void stepInSpace(int x, int y) {
    if (!(square[x][y].getFlagged())) {
        if (square[x][y].getBomb()) {
            java.lang.System.out.println("game over");
        }else {
            checkAdjacentBombs(square[x][y]);
        }
    }
}