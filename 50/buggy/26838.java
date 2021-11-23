@javafx.fxml.FXML
public void handleLoginPressed() {
    if (isInputValid()) {
        if (checkUserInfo()) {
            mainApplication.showWelcomeScreen();
            loginStage.close();
            isClicked = true;
        }
    }
}