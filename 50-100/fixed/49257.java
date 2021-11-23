public static int getQuizTakenNumber() throws java.sql.SQLException {
    xuandong.DBConnection database = new xuandong.DBConnection();
    java.lang.String sql = "SELECT COUNT(DISTINCT QuizID) FROM QuizRecord;";
    java.sql.ResultSet res = database.getStmt().executeQuery(sql);
    res.next();
    int temp = res.getInt(1);
    database.getCon().close();
    return temp;
}