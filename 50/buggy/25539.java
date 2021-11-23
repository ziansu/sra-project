@javafx.fxml.FXML
private void enableOrDisableCheckboxes4() {
    if (option4Field.getText().isEmpty()) {
        option4Correct.setDisable(true);
    }else {
        option4Correct.setDisable(false);
    }
}