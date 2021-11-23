public void actionPerformed(java.awt.event.ActionEvent arg0) {
    ie.gmit.g00309646.mainWindow frame = new ie.gmit.g00309646.mainWindow(if_admin);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.refreshBuses();
    finish();
}