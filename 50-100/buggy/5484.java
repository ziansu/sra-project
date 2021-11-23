public void drawBoard() {
    for (int i = 0; i < (ySize); ++i) {
        for (int j = 0; j < (xSize); ++j) {
            if (citiesBoolean[i][j])
                cells[j][i].drawHexagon();
            
        }
    }
}