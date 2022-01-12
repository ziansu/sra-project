public void cleanUp() {
    try {
        if ((ps) != null) {
            ps.close();
        }
        if ((this.dbConnection) != null) {
            this.dbConnection.close();
        }
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println(e.getMessage());
    }
}