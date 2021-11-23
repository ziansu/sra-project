public void closeConnection() {
    try {
        con.close();
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(com.duttyapps.storerestful.utils.MySQLConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
}