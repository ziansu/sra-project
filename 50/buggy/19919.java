public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String message = " Vill du verkligen avsluta? ";
    java.lang.String title = "Bye bye :(";
    int reply = javax.swing.JOptionPane.showConfirmDialog(null, message, title, javax.swing.JOptionPane.YES_NO_OPTION);
    if (reply == (javax.swing.JOptionPane.YES_OPTION)) {
        java.lang.System.exit(0);
    }
}