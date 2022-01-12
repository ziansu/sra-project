@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if (!(newValue.matches("\\d*"))) {
        newValue = newValue.replaceAll("[^\\w]", "");
        if ((newValue.length()) > 7) {
            newValue = newValue.substring(0, 8);
        }
        textField.setText(newValue);
    }
}