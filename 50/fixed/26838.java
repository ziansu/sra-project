@javafx.fxml.FXML
public void handleLoginPressed() {
    if (isInputValid()) {
        if (checkUserInfo()) {
            loginStage.close();
            mainApplication.showWelcomeScreen();
            isClicked = true;
        }
    }
}