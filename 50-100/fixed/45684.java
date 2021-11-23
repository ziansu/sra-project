@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if (!(newValue.matches("\\d*"))) {
        bikeRackBox.getEditor().setText(newValue.replaceAll("[^\\d]", ""));
    }else {
        if (!(newValue.matches(""))) {
            bikeRackBox.setValue(newValue);
            recalculatePrice(null);
        }
    }
}