public synchronized boolean remove(java.lang.Object arg0) {
    try {
        java.sql.ResultSet rs = db.query((((("DELETE FROM " + (table)) + " WHERE data='") + (zutil.converters.Converter.toBytes(arg0))) + "' LIMIT 1"));
        rs.getStatement().close();
        return true;
    } catch (java.lang.Exception e) {
        e.printStackTrace(MultiPrintStream.out);
    }
    return false;
}