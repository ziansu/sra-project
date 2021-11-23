public static void insertGameTester(ca.ubc.cs.cs304.steemproject.base.development.GameTester aGameTester) throws java.sql.SQLException {
    if ((ca.ubc.cs.cs304.steemproject.access.oraclejdbc.Inserts.fInsertGameTesterStatement) == null) {
        ca.ubc.cs.cs304.steemproject.access.oraclejdbc.Inserts.fInsertGameTesterStatement = ca.ubc.cs.cs304.steemproject.access.oraclejdbc.connection.SteemOracleDbConnector.getDefaultConnection().prepareStatement((((((((((("INSERT INTO " + (Tables.GAME_TESTER_TABLENAME)) + "(") + (Tables.USER_ATTR_USERID)) + ",") + (Tables.USER_ATTR_EMAIL)) + ",") + (Tables.USER_ATTR_PASSWORD)) + ",") + ") VALUES ") + "(?,?,?)"));
    }
}