private static void reopenIfClosed() {
    try {
        if (edu.cis232.gwasos.resources.DatabaseHandler.con.isClosed()) {
            edu.cis232.gwasos.resources.DatabaseHandler.openConnection();
        }
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(ex.getMessage());
    }
}