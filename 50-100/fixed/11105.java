public void cleanUp() {
    try {
        if ((this.ps) != null) {
            this.ps.close();
        }
        if ((this.dbConnection) != null) {
            this.dbConnection.close();
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    }
}