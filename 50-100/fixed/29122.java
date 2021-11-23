private int scanExponent() {
    if (!(isExponentBreakPoint(currentChar))) {
        return MiniC.Scanner.Token.ERROR;
    }
    takeIt();
    if (isPlusMinus(currentChar)) {
        takeIt();
    }
    if (isDigit(currentChar)) {
        takeIt();
        while (isDigit(currentChar)) {
            takeIt();
        } 
        return MiniC.Scanner.Token.FLOATLITERAL;
    }
    while (!(isExponentBreakPoint(currentChar))) {
        untake();
    } 
    return MiniC.Scanner.Token.ERROR;
}