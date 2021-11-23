@java.lang.Override
public void start() {
    try {
        java.lang.String lock = "";
        lock = "LOCK TABLES databyyear WRITE;";
        stmt.execute(lock);
        java.lang.System.out.println(lock);
        java.lang.String SQL = query;
        stmt.executeUpdate(SQL);
        java.lang.System.out.println(SQL);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        isDonePopulating = true;
        java.lang.String unlock = "UNLOCK TABLES;";
        try {
            stmt.execute(unlock);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}