public char setToken(int x, int y) {
    status = myField.putStone(x, y, cPlayer);
    if (((status) == 'f') || ((status) == 'b')) {
        return status;
    }
    (counter)++;
    lastX = x;
    lastY = y;
    notifyObservers();
    return getWin(x, y, cPlayer);
}