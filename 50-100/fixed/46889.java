public void setFetchSize(int rows) throws java.sql.SQLException {
    checkOpen();
    if ((rows < 0) || (((statement.getMaxRows()) > 0) && (rows > (statement.getMaxRows())))) {
        throw new java.sql.SQLException(net.sourceforge.jtds.jdbc.Messages.get("error.generic.badparam", java.lang.Integer.toString(rows), "rows"), "HY092");
    }
    if (rows == 0) {
        rows = statement.getDefaultFetchSize();
    }
    fetchSize = rows;
}