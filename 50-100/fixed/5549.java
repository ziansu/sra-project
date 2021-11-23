public java.sql.Connection establishConnectionFromUserInput(javax.swing.JFrame frame, java.lang.String url, java.lang.String username, java.lang.String password) {
    try {
        conn = connector.getConnection(url, username, password);
        if ((conn) == null) {
            javax.swing.JOptionPane.showMessageDialog(frame, "Could not connect to database", "Inane error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return null;
        }
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    }
    return conn;
}