public java.sql.ResultSet adminRitriveSchedule() {
    try {
        java.lang.String statement = "select * from schedule";
        java.sql.Connection conn = establishConnection();
        java.sql.PreparedStatement prepStmt = conn.prepareStatement(statement);
        java.lang.System.out.println("1");
        java.lang.System.out.println(("PS " + prepStmt));
        java.sql.ResultSet rs = prepStmt.executeQuery();
        java.lang.System.out.println("2");
        conn.close();
        return rs;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("Cannot ritrive schedule.");
        return null;
    }
}