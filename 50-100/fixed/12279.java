@javafx.fxml.FXML
private void buttonBackspace(javafx.event.ActionEvent event) {
    if ((inputText.length()) > 0) {
        inputText = inputText.substring(0, ((inputText.length()) - 1));
        if (inputText.isEmpty()) {
            textFieldResults.setText("0");
        }else {
            textFieldResults.setText(inputText);
        }
    }
}