private int checkSum() {
    int _checkSum = 0;
    char[] hold = zipnum.toCharArray();
    for (int x = 0; x < (hold.length); x++) {
        java.lang.String dig = "" + (hold[x]);
        _checkSum += java.lang.Integer.parseInt(java.lang.String.parseString(dig));
    }
    return _checkSum % 10;
}