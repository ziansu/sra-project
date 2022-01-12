public boolean columnIsDead(int column) {
    setTempBoard();
    if ((add(column)) == 1) {
        restoreBoardState();
        return true;
    }
    restoreBoardState();
    return false;
}