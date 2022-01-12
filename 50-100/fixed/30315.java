@javafx.fxml.FXML
public void onClickButtonToDegrees() {
    if (((text.length()) != 0) && (!(operators.contains(text.substring(((text.length()) - 1)))))) {
        text += "^";
        setText(text);
    }
}