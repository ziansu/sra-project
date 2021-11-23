private boolean columnHasCards(int columnNumber) {
    if ((this.cols.get(columnNumber).size()) == 0) {
        return true;
    }
    return false;
}