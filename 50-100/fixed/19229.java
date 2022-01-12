public int getPelletNum() {
    int numOfPellet = 0;
    for (int i = 0; i < (Board.NUMBLOCKS); i++) {
        for (int j = 0; j < (Board.NUMBLOCKS); j++) {
            if (((screenData[i][j]) & 16) != 0)
                numOfPellet++;
            
        }
    }
    return numOfPellet;
}