public static void addCharacterAbility(java.sql.Connection conn, int chID, int abID) {
    try {
        java.sql.PreparedStatement pStmt = conn.prepareStatement((("INSERT INTO " + (as.project.tables.CharacterAbilityTable.tableName)) + " VALUES(?,?);"));
        pStmt.setInt(1, chID);
        pStmt.setInt(2, abID);
        pStmt.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}