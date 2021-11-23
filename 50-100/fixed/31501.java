public char setToken(int x, int y) {
    status = myField.putStone(x, y, cPlayer);
    if (((status) == 'f') || ((status) == 'b')) {
        notifyObservers();
        return status;
    }
    (counter)++;
    lastX = x;
    lastY = y;
    status = getWin(x, y, cPlayer);
    notifyObservers();
    return status;
}