public boolean isFull() {
    for (int i = 0; i < (cells.size()); i++) {
        if (isEmptyCell(i)) {
            return false;
        }
    }
    return true;
}