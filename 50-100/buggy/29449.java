public static void initializeResidesInTable() {
    try {
        data.DatabaseController.stmt = data.DatabaseController.connection.createStatement();
        data.DatabaseController.stmt.execute("DROP TABLE ResidesIn");
        data.DatabaseController.stmt.execute(("CREATE TABLE ResidesIn(" + (("ServiceName VARCHAR(50) NOT NULL PRIMARY KEY, " + "NodeID INT ") + ")")));
        java.lang.System.out.println("ResidesIn table initialized");
        data.DatabaseController.stmt.close();
    } catch (java.sql.SQLException sqlExcept) {
        if (!(sqlExcept.getSQLState().equals("X0Y33"))) {
            sqlExcept.printStackTrace();
        }else {
            java.lang.System.out.println("ResidesIn table already exists");
        }
    }
}