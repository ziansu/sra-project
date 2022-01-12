public java.sql.PreparedStatement doPrepareStatement(jef.database.OperateTarget conn, java.lang.String sql) throws java.sql.SQLException {
    java.sql.PreparedStatement pst = conn.prepareStatement(sql, columnName);
    this.st.set(pst);
    return pst;
}