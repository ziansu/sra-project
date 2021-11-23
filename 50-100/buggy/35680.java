protected final java.lang.String _addDecodedToSymbols(int len, java.lang.String name) {
    if (len < 5) {
        return _symbols.addName(name, _quad1, 0);
    }
    if (len < 9) {
        return _symbols.addName(name, _quad1, _quad2);
    }
    int qlen = (len + 3) >> 2;
    return _symbols.addName(name, _quadBuffer, qlen);
}