public void closeDatabaseConnection() {
    if ((this.c) != null) {
        try {
            this.stmt.close();
            this.c.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}