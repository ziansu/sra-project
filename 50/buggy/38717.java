public static void init() throws java.sql.SQLException {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
    } catch (java.lang.ClassNotFoundException e) {
        itdelatrisu.opsu.ErrorHandler.error("Could not load sqlite-JDBC driver.", e, true);
    }
    itdelatrisu.opsu.db.BeatmapDB.init();
    itdelatrisu.opsu.db.ScoreDB.init();
}