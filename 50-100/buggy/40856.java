private java.lang.String getValueOf(java.lang.String field) {
    java.sql.Statement stat = null;
    java.lang.String sql = ("select value from properties where field = \"" + field) + "\"";
    try {
        stat = conn.createStatement();
        java.sql.ResultSet rs = stat.executeQuery(sql);
        if (rs.next()) {
            return rs.getString("value");
        }
    } catch (java.sql.SQLException e) {
        es.psig.homesig.util.Utils.showError(e.getMessage(), sql, "");
    }
    return "ERROR";
}