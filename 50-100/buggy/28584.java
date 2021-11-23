public static void addCharacterAbility(java.sql.Connection conn, int abID, int chID) {
    try {
        java.sql.PreparedStatement pStmt = conn.prepareStatement((("INSERT INTO " + (as.project.tables.CharacterAbilityTable.tableName)) + " VALUES(?,?);"));
        pStmt.setInt(1, chID);
        pStmt.setInt(2, abID);
        pStmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}