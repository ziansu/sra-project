private static void createConnection() {
    try {
        com.innopolis.courses.dmd.premasters.java4life.XMLParser.connection = java.sql.DriverManager.getConnection(((com.innopolis.courses.dmd.premasters.java4life.XMLParser.URL) + (com.innopolis.courses.dmd.premasters.java4life.XMLParser.DB_NAME)), com.innopolis.courses.dmd.premasters.java4life.XMLParser.USER, com.innopolis.courses.dmd.premasters.java4life.XMLParser.PASS);
        com.innopolis.courses.dmd.premasters.java4life.XMLParser.statement = com.innopolis.courses.dmd.premasters.java4life.XMLParser.connection.createStatement();
    } catch (java.sql.SQLException e) {
        com.innopolis.courses.dmd.premasters.java4life.XMLParser.logger.wrapper.log(java.util.logging.Level.SEVERE, ("Unexpected SQL exception: " + e));
    }
}