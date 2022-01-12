public java.sql.ResultSet searchSchedule(java.lang.String date) {
    java.sql.Connection conn = null;
    java.sql.PreparedStatement prepStmt = null;
    java.sql.ResultSet rs = null;
    try {
        com.Project.Models.DBHandler db = new com.Project.Models.DBHandler();
        java.lang.String statement = ("SELECT * FROM Schedule WHERE date LIKE\"%" + date) + "%\"";
        conn = db.establishConnection();
        prepStmt = conn.prepareStatement(statement);
        rs = prepStmt.executeQuery();
        java.lang.System.out.println("Success");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("error. Not found.");
    }
    return rs;
}