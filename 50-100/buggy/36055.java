public long getLong() throws com.wiredtiger.db.WiredTigerPackingException {
    boolean signed = false;
    format.checkType('q', false);
    if ((format.getType()) == 'Q') {
        signed = true;
    }
    format.consume();
    return unpackLong(signed);
}