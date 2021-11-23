public void deleteRecord(int id) {
    dbConnection = dbService.getConnection();
    try {
        java.lang.String sSQL = "DELETE FROM `contacts` WHERE _id=?";
        ps = dbConnection.prepareStatement(sSQL);
        ps.setInt(1, id);
        ps.executeUpdate();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    } finally {
        dbService.cleanUp();
    }
}