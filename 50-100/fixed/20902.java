private void highlightAndSwapUnit(int xPos, int yPos) {
    if ((xPos < (board.NUM_COLS)) && (yPos < (board.NUM_ROWS))) {
        sanoke.qx.Unit unit = board.getUnit(yPos, xPos);
        unit.toggleSelected();
        if (unit.isSelected()) {
            if (isReadyToSwap) {
                swapUnit(unit);
            }else {
                isReadyToSwap = true;
                selectedUnit = unit;
            }
        }else {
            isReadyToSwap = false;
            selectedUnit = null;
        }
    }
}