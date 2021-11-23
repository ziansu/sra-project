public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.Object[] options = new java.lang.Object[]{ "Confirm" , "Cancel" };
    int n = javax.swing.JOptionPane.showOptionDialog(exitWindow, "Are you sure you want to begin a new game? All progress wil be lost.", "Hnefatafl", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, options, options[0]);
    if (n == 0) {
        copenhagen.Hnefatafl.newGame();
    }
    if (n == 1) {
        return ;
    }
}