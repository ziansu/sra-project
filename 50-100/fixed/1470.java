public void actionPerformed(java.awt.event.ActionEvent e) {
    if (credentialsValid(textUsername.getText(), passwordField1.getText(), passwordField2.getText())) {
        createUser(textUsername.getText(), passwordField1.getText());
        containedIn.showRPage();
    }
}