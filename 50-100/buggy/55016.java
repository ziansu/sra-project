private void gameJoinBtnActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String name = gameJoinName.getText();
    java.lang.String adress = gameJoinAdressText.getText();
    int gamemode = gameJoinChoose.getSelectedIndex();
    try {
        java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder("java", "-jar", "mpmp.jar", "client");
        java.lang.Process p = pb.start();
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(ex);
    }
}