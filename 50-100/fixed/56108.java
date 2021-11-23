public java.lang.String getLastBlockHash() {
    try {
        java.sql.ResultSet result = statement.executeQuery("select hash from records order by record_id desc limit 1;");
        if (result.next()) {
            return result.getString(1);
        }else {
            return "0";
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return "0";
    }
}