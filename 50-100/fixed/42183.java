public void deleteRecord(int id) {
    this.dbConnection = this.dbService.getConnection();
    try {
        java.lang.String sSQL = "DELETE FROM `contacts` WHERE _id=?";
        this.ps = this.dbConnection.prepareStatement(sSQL);
        this.ps.setInt(1, id);
        this.ps.executeUpdate();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    } finally {
        this.dbService.cleanUp();
    }
}