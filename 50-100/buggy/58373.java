@javafx.fxml.FXML
public void onClickButtonEqual() {
    if ((!(operators.contains(text.substring(((text.length()) - 1))))) && ((text.length()) != 0)) {
        java.lang.String output = Model.ReversePolishNotation.createOutput(text);
        double result = new Model.Calc().getResult(output);
        text = result + "";
        setText(text);
        text = "";
    }
}