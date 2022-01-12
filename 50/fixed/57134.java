public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        connector.getConnection(url.getText(), username.getText(), password.getText());
    } catch (java.sql.SQLException ex) {
        ex.printStackTrace();
    }
}