private void updateColor(int x, int y) {
    if ((pawns[x][y].color) == (Color.BLACK)) {
        this.pawns[x][y].color = Color.WHITE;
    }else {
        this.pawns[x][y].color = Color.BLACK;
    }
}