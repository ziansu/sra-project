public void run() throws java.lang.ClassNotFoundException {
    java.lang.Class.forName("org.sqlite.JDBC");
    try {
        java.sql.Connection conn = null;
        conn = this.getConnection();
        java.lang.System.out.println("Successfully connected to database!");
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("Error: Could not connect to the database.");
        e.printStackTrace();
        return ;
    }
}