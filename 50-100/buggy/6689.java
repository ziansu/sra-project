private java.lang.String askForFirstPassword() {
    java.lang.String ret = null;
    java.lang.String s1 = askForPassword("Insert a password for secure archive. You MUST remember it unlock the archive!");
    if (s1 != null) {
        java.lang.String s2 = askForPassword("Please re-type the previous password");
        if (s2 != null) {
            if (s1.equals(s2)) {
                ret = s1;
            }else {
                javax.swing.JOptionPane.showMessageDialog(this, "Two password doesn't match!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
                askForFirstPassword();
            }
        }
    }
    return ret;
}