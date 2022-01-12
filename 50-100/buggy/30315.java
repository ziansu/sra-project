@javafx.fxml.FXML
public void onClickButtonToDegrees() {
    if ((!(operators.contains(text.substring(((text.length()) - 1))))) && ((text.length()) != 0)) {
        text += "^";
        setText(text);
    }
}