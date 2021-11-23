public boolean isFull() {
    for (int i = 1; i < (cells.size()); i++) {
        if (isEmptyCell(i)) {
            return false;
        }
    }
    return true;
}