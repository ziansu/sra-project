public void actionPerformed(java.awt.event.ActionEvent event) {
    int result = javax.swing.JOptionPane.showOptionDialog(null, "Are you really want to quit?", "Are you really want to quit?", javax.swing.JOptionPane.OK_CANCEL_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, new java.lang.String[]{ "Yes, quit" , "No, cancel" }, "No, cancel");
    if (result == 0) {
        java.lang.System.out.println("111111111111");
        gameContent.closeGame();
        java.lang.System.out.println("4444444444444444444");
    }
}