public int getInt() throws com.wiredtiger.db.WiredTigerPackingException {
    boolean signed = false;
    format.checkType('i', false);
    if (((format.getType()) == 'I') || ((format.getType()) == 'L')) {
        signed = true;
    }
    format.consume();
    return unpackInt(signed);
}