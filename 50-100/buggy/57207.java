protected void error(java.lang.Exception ex, java.lang.String query) {
    purplepetal.panel.DataPanel.LOGGER.log(java.util.logging.Level.SEVERE, null, ex);
    java.lang.String msg = java.lang.String.format("%s\n%s", query, ex.getMessage());
    javax.swing.JOptionPane.showMessageDialog(this, msg, "Warning!", javax.swing.JOptionPane.WARNING_MESSAGE);
}