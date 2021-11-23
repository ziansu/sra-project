public java.sql.Connection connect() {
    try {
        java.lang.Class.forName("org.sqlite.JDBC");
    } catch (java.lang.ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(de.buxdehuda.archivar.Archivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    java.sql.Connection tempConn = null;
    try {
        tempConn = java.sql.DriverManager.getConnection((("jdbc:sqlite:" + (de.buxdehuda.archivar.Archivar.FOLDER)) + "bilder.db"));
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(de.buxdehuda.archivar.Archivar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return tempConn;
}