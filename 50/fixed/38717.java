public static void init() throws java.lang.ClassNotFoundException, java.sql.SQLException {
    java.lang.Class.forName("org.sqlite.JDBC");
    itdelatrisu.opsu.db.BeatmapDB.init();
    itdelatrisu.opsu.db.ScoreDB.init();
}