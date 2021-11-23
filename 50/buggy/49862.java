public void closeConnection() {
    try {
        con.close();
        java.lang.System.out.println("Connection closed");
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(dar.localDB.LocalWraper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}