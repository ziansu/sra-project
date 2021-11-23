private boolean isRowComplete(ohn1.gps.api.Ohn1State state) {
    int current = Cell.Grey.getValue();
    int sameColor = 1;
    for (int col = 0; col < (Ohn1State.BOARD_SIZE); col++) {
        int cell = state.getCell(row, col);
        if (!(ohn1.gps.api.Cell.sameColor(current, cell))) {
            current = cell;
            sameColor = 1;
        }else {
            sameColor++;
            if (sameColor >= 3) {
                return false;
            }
        }
    }
    return true;
}