public static void openConnection() {
    try {
        try {
            if (((edu.cis232.gwasos.resources.DatabaseHandler.con) == null) || (edu.cis232.gwasos.resources.DatabaseHandler.con.isClosed())) {
                edu.cis232.gwasos.resources.DatabaseHandler.con = java.sql.DriverManager.getConnection(edu.cis232.gwasos.resources.DatabaseHandler.GWASOS_DB);
            }
        } catch (java.lang.NullPointerException ex) {
            edu.cis232.gwasos.resources.DatabaseHandler.con = java.sql.DriverManager.getConnection(edu.cis232.gwasos.resources.DatabaseHandler.GWASOS_DB);
        }
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(("Error while opening connection." + (ex.getMessage())));
    }
}