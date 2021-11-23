private void startJanekBujButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (!(areGameButtonsStatesOk(org.stepinterpreter.janek.GameChoiceJPanel.janekBuj))) {
        javax.swing.JOptionPane.showMessageDialog(this, "Masz odpaloną już inną grę");
        return ;
    }
    interpreter = new org.stepinterpreter.janek.JanekBujInterpreter();
    thread = new java.lang.Thread(janekBujInterpreter);
    thread.start();
    java.lang.System.out.println("Akcja!");
    showDeactivationButton();
}