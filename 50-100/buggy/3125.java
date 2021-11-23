public void actionPerformed(java.awt.event.ActionEvent event) {
    if ((java.lang.Integer.parseInt(display.getTextFieldText())) == 12347)
        displayAdminPanel();
    
    if ((display.getTextFieldText().matches("[0-9]+")) && ((validateVoter(java.lang.Integer.parseInt(display.getTextFieldText()))) == true)) {
        ballot.setVoterID(java.lang.Integer.parseInt(display.getTextFieldText()));
        moveToNextView();
    }else
        display.warn("Incorrect Registration Number.");
    
}