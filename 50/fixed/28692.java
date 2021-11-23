public void mouseClicked(java.awt.event.MouseEvent me) {
    int n = javax.swing.JOptionPane.showConfirmDialog(null, "Are you sure to stop and close the ARE?", "ARE Exit", javax.swing.JOptionPane.YES_NO_OPTION);
    if (n == (javax.swing.JOptionPane.YES_OPTION)) {
        astericsGUI.closeAction();
    }
}