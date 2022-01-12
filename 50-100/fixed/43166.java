void onMousePressed(int x, int y) {
    int row = getRowNumberFromY(y);
    int col = getColumnNumberFromX(x);
    boolean currentCellChanged = setCurrent(row, col);
    requestFocusInWindow();
    if (!currentCellChanged) {
        if (isEditable()) {
            startEditing();
            editing = true;
        }
    }else {
        if (editing) {
            stopEditing(true);
            editing = false;
        }
    }
}