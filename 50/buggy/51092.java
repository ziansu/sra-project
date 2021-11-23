private void handleServerTextField() {
    if ((!(org.parabot.launcher.Controller.server)) && (serverTextField.isVisible())) {
        serverTextField.setVisible(false);
    }else {
        serverTextField.setVisible(true);
    }
}