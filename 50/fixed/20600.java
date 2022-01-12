private boolean executeCALL() {
    boolean isOk = false;
    if (isUserFunction(false, false)) {
        isOk = (doUserFunction()) && (checkEOL());
    }
    return isOk;
}