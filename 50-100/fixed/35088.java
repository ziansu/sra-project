public void openConnection(java.sql.Connection c) {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
        c = java.sql.DriverManager.getConnection("jdbc:sqlite:FacilityManagementSystem.db");
    } catch (java.lang.Exception e) {
        java.lang.System.err.println((((e.getClass().getName()) + ": ") + (e.getMessage())));
        java.lang.System.exit(0);
    }
}