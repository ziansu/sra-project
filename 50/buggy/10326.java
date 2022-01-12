public boolean columnIsDead(int column) {
    setTempBoard();
    if (add(column)) {
        restoreBoardState();
        return true;
    }
    restoreBoardState();
    return false;
}