public void closeConnection() {
    try {
        con.close();
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(dar.localDB.LocalWraper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}