public void drawBoard() {
    for (int i = 0; i < (ySize); ++i) {
        for (int j = 0; j < (xSize); ++j) {
            if (citiesBoolean[j][i])
                cells[j][i].drawHexagon();
            
        }
    }
}