@java.lang.SuppressWarnings(value = "unchecked")
public synchronized E peek() {
    try {
        java.sql.ResultSet rs = db.returnQuery((("SELECT * FROM " + (table)) + " LIMIT 1"));
        if (rs.next()) {
            return ((E) (zutil.converters.Converter.toObject(rs.getBytes("data"))));
        }
        rs.getStatement().close();
    } catch (java.lang.Exception e) {
        e.printStackTrace(MultiPrintStream.out);
    }
    return null;
}