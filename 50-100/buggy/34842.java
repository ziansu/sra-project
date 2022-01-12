@java.lang.Override
protected boolean stringMatchesPatternNoLock(java.lang.String str) {
    boolean r = false;
    if ((isAlphabetic(str)) && (((knownSymbols) == null) || (knownSymbols.contains(str)))) {
        r = true;
    }
    return r;
}