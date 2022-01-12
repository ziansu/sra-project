private void popUpAlert() {
    java.lang.Object[] options = new java.lang.Object[]{ "Yes" , "No" };
    int n = javax.swing.JOptionPane.showOptionDialog(this, ("Changes have been made to the game board. Would" + " you like to save those changes?"), "Warning", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, options, options[0]);
    if (n == 0) {
        save();
    }else
        if (n == 1) {
            java.lang.System.exit(0);
        }
    
}