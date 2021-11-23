private me.legrange.mikrotik.impl.Scanner.Token notEquals() throws me.legrange.mikrotik.impl.ScanException {
    nextChar();
    if ((c) != '=') {
        throw new me.legrange.mikrotik.impl.ScanException(java.lang.String.format("Expected = after !, found '%c'", c));
    }
    nextChar();
    return me.legrange.mikrotik.impl.Scanner.Token.NOT_EQUALS;
}