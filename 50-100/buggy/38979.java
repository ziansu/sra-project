private boolean checkTableExist() {
    try {
        java.lang.String result = getFromDB(true);
        if (result.equalsIgnoreCase("error")) {
            return true;
        }
    } catch (java.sql.SQLException ex) {
        java.util.logging.Logger.getLogger(edu.csu.lpm.DB.implementation.UserAuthDAO_impl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return false;
}