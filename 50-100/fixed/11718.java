public void actionPerformed(final java.awt.event.ActionEvent event) {
    if ((pvLoggerID) != 0) {
        if (USE_PVLOGGER.isSelected())
            USE_LOGGEDBEND.setEnabled(true);
        else
            USE_LOGGEDBEND.setEnabled(false);
        
        setHasChanges(true);
    }else {
        javax.swing.JOptionPane.showMessageDialog(mainWindow, "You need to select pvLoggerData first", "Warning!", javax.swing.JOptionPane.PLAIN_MESSAGE);
        USE_PVLOGGER.setSelected(false);
    }
}