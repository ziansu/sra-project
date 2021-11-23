private static boolean isSecondChar(nez.lang.Expression e) {
    if (e instanceof nez.lang.Nez.Pair) {
        return nez.lang.Expressions.isFirstChar(e.get(1));
    }
    if (e instanceof nez.lang.Nez.Sequence) {
        return (e.get(1)) instanceof nez.lang.Nez.Byte;
    }
    return false;
}