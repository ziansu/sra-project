@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if ((com.klq.gui.InputValidator.matches(type, newValue)) && (!(newValue.equals("")))) {
        control.setStyle("-fx-border-color: white;");
        control.setStyle("-fx-focus-color: #0950ff;");
        questionAnswered(newValue);
    }else {
        control.setStyle("-fx-border-color: red;");
        control.setStyle("-fx-focus-color: red;");
    }
}