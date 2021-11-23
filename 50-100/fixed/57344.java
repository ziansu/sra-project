public void moveUp() {
    for (int i = 0; i < 4; i++) {
        for (int c = 0; c < 4; c++) {
            if ((blocks[i][c]) != null)
                blocks[i][c].moveUp();
            
        }
    }
}