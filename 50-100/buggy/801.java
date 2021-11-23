@javafx.fxml.FXML
private void handleKeyPress(javafx.scene.input.KeyEvent event) {
    javafx.scene.input.KeyCode key = event.getCode();
    switch (key) {
        case UP :
            java.lang.String prevCommand = getPrevCommand(lastPrev);
            lastPrev = prevCommand;
            commandTextField.setText(prevCommand);
            return ;
        case DOWN :
            java.lang.String nextCommand = getNextCommand(currentShownCommand);
            commandTextField.setText(nextCommand);
            return ;
    }
}