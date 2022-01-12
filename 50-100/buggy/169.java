private void getConnection() {
    try {
        java.lang.Class.forName(dar.localDB.LocalWraper.DB_DRIVER);
        con = java.sql.DriverManager.getConnection(dar.localDB.LocalWraper.DB_CONN_STRING, dar.localDB.LocalWraper.DB_LOGIN, dar.localDB.LocalWraper.DB_PASS);
        java.lang.System.out.println("connected");
    } catch (java.sql.SQLException ex) {
        if ((ex.getErrorCode()) == 90020) {
            javax.swing.JOptionPane.showMessageDialog(null, "Application is already in use!\nPlease restart application and try it again.", "Already in use", javax.swing.JOptionPane.ERROR_MESSAGE);
        }else {
            ex.printStackTrace();
        }
    } catch (java.lang.ClassNotFoundException ex) {
        ex.printStackTrace();
    }
}