private void clear() {
    for (int x = 0; x < (this.width); x++) {
        for (int y = 0; y < (this.height); y++) {
            java.lang.System.out.println(((("DEBUG: Trying to add a square at " + x) + ",") + y));
            this.board[x][y] = new minesweeper.logic.Square();
            java.lang.System.out.println(((("DEBUG: added square at " + x) + ",") + y));
        }
    }
}