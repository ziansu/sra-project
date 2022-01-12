public void deleteSchedule(java.sql.Date date) {
    java.sql.Connection conn = null;
    java.sql.PreparedStatement prepStmt = null;
    java.sql.ResultSet rs = null;
    try {
        java.lang.String statement = "DELETE FROM Schedule WHERE date = ?";
        conn = establishConnection();
        prepStmt = conn.prepareStatement(statement);
        prepStmt.setDate(1, date);
        prepStmt.execute();
        java.lang.System.out.println("Success removed");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("error. Not delete.");
    }
}