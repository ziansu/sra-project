@javafx.fxml.FXML
void downPressed() {
    if ((i) > 1) {
        i = (i) - 1;
        units.setText(((i) + ""));
    }
}