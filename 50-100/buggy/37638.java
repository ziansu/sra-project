@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (SaveProtocol.saved)
        java.lang.System.exit(0);
    else {
        int answer = javax.swing.JOptionPane.showConfirmDialog(mainFrame, "Exit without saving?");
        if (answer == (javax.swing.JOptionPane.YES_OPTION))
            java.lang.System.exit(0);
        else
            if (answer == (javax.swing.JOptionPane.NO_OPTION)) {
                ie.exportToFile(mainFrame);
                java.lang.System.exit(0);
            }
        
    }
}