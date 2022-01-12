private int checkSum() {
    int _checkSum = 0;
    char[] hold = zipnum.toCharArray();
    for (int x = 0; x < (hold.length); x++) {
        _checkSum += java.lang.Integer.parseInteger(hold[x]);
    }
    return _checkSum % 10;
}