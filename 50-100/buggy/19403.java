private void quitApp() {
    int answer = javax.swing.JOptionPane.showConfirmDialog(null, "Save data?");
    if (answer == (javax.swing.JOptionPane.YES_OPTION)) {
        controller.saveData();
        controller.disconnectFromDatabase();
        java.lang.System.exit(0);
    }else
        if (answer == (javax.swing.JOptionPane.NO_OPTION))
            controller.disconnectFromDatabase();
        
    
    java.lang.System.exit(0);
}