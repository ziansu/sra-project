@javafx.fxml.FXML
void upPressed() {
    i = java.lang.Integer.parseInt(units.getText());
    (i)++;
    units.setText(((i) + ""));
}