public boolean checkFullFile() {
    if ((pieces.cardinality()) == (totalPieces)) {
        isFull = true;
    }
    return isFull;
}