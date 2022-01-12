private java.lang.String[] splitTrim(java.lang.String line, java.lang.String splitAt) {
    java.lang.String[] retrn = line.split(splitAt);
    for (int i = 0; i < (retrn.length); i++) {
        retrn[i] = retrn[i].trim();
    }
    return retrn;
}