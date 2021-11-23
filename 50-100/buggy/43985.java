private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    connection.setUsername(tboxUsername.getText());
    connection.setServer(tboxServer.getText());
    if (("".equals(tboxDatabase.getText())) == false) {
        connection.setDatabase(null);
    }
    connection.setPassword(getPassword());
    if (connection.connect()) {
        mainWindow.refresh();
        setVisible(false);
        dispose();
    }else {
    }
}