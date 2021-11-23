public static void createAnnouncement(java.lang.String announcement) throws java.sql.SQLException {
    announcement = sql.SQL.escapeQuote(announcement);
    java.sql.Statement s = sql.SQL.getStatement();
    s.executeUpdate(java.lang.String.format("INSERT INTO Announcements VALUES ('%s', %s)", announcement, sql.SQL.convertDateToSQLDate(new java.util.Date())));
    s.close();
}