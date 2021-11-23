private boolean hasWholeCode() {
    boolean hasWholeCode = true;
    for (char item : pinCodeArray) {
        hasWholeCode = item != (NULL_CHARACTER);
    }
    return hasWholeCode;
}