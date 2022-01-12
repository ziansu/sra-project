public short getShort() throws com.wiredtiger.db.WiredTigerPackingException {
    boolean signed = false;
    format.checkType('h', false);
    if ((format.getType()) == 'H') {
        signed = true;
    }
    format.consume();
    return unpackShort(signed);
}