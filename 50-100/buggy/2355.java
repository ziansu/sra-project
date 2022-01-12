public boolean contains(java.lang.Object arg0) {
    try {
        java.sql.ResultSet rs = db.returnQuery((((("SELECT data FROM " + (table)) + " WHERE data='") + (zutil.converters.Converter.toBytes(arg0))) + "' LIMIT 1"));
        if (rs.next()) {
            return true;
        }
        rs.getStatement().close();
    } catch (java.lang.Exception e) {
        e.printStackTrace(MultiPrintStream.out);
    }
    return false;
}