public static void createProcedure() throws java.sql.SQLException {
    trains.Database.createTables();
    trains.Database.executeStatement(trains.Database.proc);
}