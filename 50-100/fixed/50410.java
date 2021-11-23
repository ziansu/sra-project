@javafx.fxml.FXML
private void disableTyping() throws java.lang.InterruptedException {
    while ((hasInstructionPlayed) == false) {
        userPasswordField.setVisible(false);
        ATMjavafx.Sound.pleaseEnterYourPassword.stop();
        ATMjavafx.Sound.pleaseEnterYourPassword.play();
        while (ATMjavafx.Sound.pleaseEnterYourPassword.isPlaying()) {
            java.lang.Thread.sleep(2000);
            userPasswordField.clear();
        } 
        hasInstructionPlayed = true;
        userPasswordField.setVisible(true);
    } 
}