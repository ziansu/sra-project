public void moveUp() {
    for (int i = 0; i < 4; i++) {
        for (int c = 0; c < 4; c++) {
            blocks[i][c].moveUp();
        }
    }
}