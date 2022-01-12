@java.lang.Override
public void windowClosing(java.awt.event.WindowEvent e) {
    if ((students) != null) {
        int response = javax.swing.JOptionPane.showConfirmDialog(this, "Do you want to save the file before closing?");
        if (response == (javax.swing.JOptionPane.YES_OPTION)) {
            onSaveFile(null);
            java.lang.System.exit(0);
        }else
            if (response == (javax.swing.JOptionPane.NO_OPTION)) {
                java.lang.System.exit(0);
            }
        
    }else {
        java.lang.System.exit(0);
    }
}