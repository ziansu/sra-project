void deleteFullRows() {
    for (int y = 0; y < (rowCountY); y++) {
        boolean full = true;
        for (int x = 0; x < (rowCountX); x++) {
            if ((isPositionOccupied(x, y)) == false) {
                full = false;
                break;
            }
        }
        if (full) {
            deleteRow(y);
            y--;
            (currentScore)++;
        }
    }
}