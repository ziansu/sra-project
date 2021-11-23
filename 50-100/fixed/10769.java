@java.lang.Override
public void dispose() {
    if ((timer) != null)
        timer.stop();
    
    byte option = ((byte) (javax.swing.JOptionPane.showConfirmDialog(this, "Exit all programs?", "Exit Confirmation", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION)));
    if (option == (javax.swing.JOptionPane.YES_OPTION)) {
        java.lang.System.exit(0);
    }else
        if (option == (javax.swing.JOptionPane.NO_OPTION)) {
            super.dispose();
        }
    
}