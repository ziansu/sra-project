private boolean isRowComplete(ohn1.gps.api.Ohn1State state) {
    for (int col = 0; col < (Ohn1State.BOARD_SIZE); col++) {
        int sameColor = 0;
        int current = Cell.Grey.getValue();
        int cell = state.getCell(row, col);
        if (!(ohn1.gps.api.Cell.sameColor(current, cell))) {
            current = cell;
            sameColor = 0;
        }else {
            sameColor++;
            if (sameColor >= 3) {
                return false;
            }
        }
    }
    return true;
}