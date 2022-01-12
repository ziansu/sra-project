@javafx.fxml.FXML
private void buttonBackspace(javafx.event.ActionEvent event) {
    if ((inputText.length()) > 0) {
        inputText = inputText.substring(0, ((inputText.length()) - 1));
        textFieldResults.setText(inputText);
    }
}