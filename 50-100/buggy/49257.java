public static int getQuizTakenNumber() throws java.sql.SQLException {
    xuandong.DBConnection database = new xuandong.DBConnection();
    java.lang.String sql = "SELECT COUNT(DISTINCT QuizID) FROM QuizRecord;";
    java.sql.ResultSet res = database.getStmt().executeQuery(sql);
    database.getCon().close();
    res.next();
    return res.getInt(1);
}