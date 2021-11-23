public boolean delete(java.lang.String login) {
    try {
        java.lang.String delQuery = ((("delete from " + (com.sheremet.LoginRegUtils.table)) + " where login='") + (login.replaceAll("'", ""))) + "'";
        java.lang.System.err.println(delQuery);
        return db.execute(delQuery);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}