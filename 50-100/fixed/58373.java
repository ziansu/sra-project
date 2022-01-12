@javafx.fxml.FXML
public void onClickButtonEqual() {
    if (((text.length()) != 0) && (!(operators.contains(text.substring(((text.length()) - 1)))))) {
        java.lang.String output = Model.ReversePolishNotation.createOutput(text);
        double result = new Model.Calc().getResult(output);
        text = result + "";
        setText(text);
        text = "";
    }
}