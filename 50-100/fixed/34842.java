@java.lang.Override
protected boolean stringMatchesPatternNoLock(java.lang.String str) {
    boolean r = false;
    if ((isAlphabetic(str)) && ((((knownSymbols) == null) || ((knownSymbols.size()) == 0)) || (!(knownSymbols.contains(str))))) {
        r = true;
    }
    return r;
}