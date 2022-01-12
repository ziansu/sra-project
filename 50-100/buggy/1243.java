private org.maximachess.jdrone.learn.LBEntry getEntry(org.maximachess.chess.Board b, int variant) {
    java.lang.String key = getKey(b, variant);
    org.maximachess.jdrone.learn.LBEntry e = getBook().getEntry(key);
    if (e == null) {
        e = new org.maximachess.jdrone.learn.LBEntry(key);
        getBook().setEntry(e);
    }
    validateEntry(e);
    return e;
}