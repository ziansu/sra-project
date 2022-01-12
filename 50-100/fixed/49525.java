private void ipDialog() {
    java.lang.String ip = javax.swing.JOptionPane.showInputDialog("IP des Hosts eingeben: ", get_ip());
    if (ip == null)
        java.lang.System.exit(0);
    
    try {
        s = new java.net.Socket(ip, 44444);
    } catch (java.io.IOException e) {
        jOptionPane.showMessageDialog(this, "Server antwortet nicht.", "Verbindungsproblem", javax.swing.JOptionPane.WARNING_MESSAGE);
        ipDialog();
    }
}