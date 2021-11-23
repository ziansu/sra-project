private boolean executeCALL() {
    boolean isOk = false;
    if (isUserFunction(false, false)) {
        isOk = doUserFunction();
        isOk &= checkEOL();
    }
    return isOk;
}