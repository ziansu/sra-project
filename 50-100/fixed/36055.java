public long getLong() throws com.wiredtiger.db.WiredTigerPackingException {
    boolean signed = true;
    format.checkType('q', false);
    if ((format.getType()) == 'Q') {
        signed = false;
    }
    format.consume();
    return unpackLong(signed);
}