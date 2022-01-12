public int getInt() throws com.wiredtiger.db.WiredTigerPackingException {
    boolean signed = true;
    format.checkType('i', false);
    if (((format.getType()) == 'I') || ((format.getType()) == 'L')) {
        signed = false;
    }
    format.consume();
    return unpackInt(signed);
}