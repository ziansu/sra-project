public void windowClosing(java.awt.event.WindowEvent e) {
    int confirm = javax.swing.JOptionPane.showOptionDialog(null, "Are you sure you want to close this window?", "Exit?", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, null, null);
    if (confirm == (javax.swing.JOptionPane.YES_OPTION)) {
        try {
            sss.services.DbConnector.closeConnection();
            java.lang.System.out.println("DB connection closed.");
            mainMenuFrame.dispose();
        } catch (java.sql.SQLException sqle) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error: The connection to the database could not be closed properly", "DB Connection Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            sqle.printStackTrace();
        }
    }
}