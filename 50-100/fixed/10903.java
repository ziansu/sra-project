public short getShort() throws com.wiredtiger.db.WiredTigerPackingException {
    boolean signed = true;
    format.checkType('h', false);
    if ((format.getType()) == 'H') {
        signed = false;
    }
    format.consume();
    return unpackShort(signed);
}