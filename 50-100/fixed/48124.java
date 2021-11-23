public int size() {
    try {
        java.sql.ResultSet rs = db.query(("SELECT count(*) FROM " + (table)));
        if (rs.next()) {
            return rs.getInt(1);
        }
        rs.getStatement().close();
    } catch (java.lang.Exception e) {
        e.printStackTrace(MultiPrintStream.out);
    }
    return 0;
}