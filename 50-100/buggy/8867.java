@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if (newValue.matches("\\d*")) {
        processScheduler.logic.Message.PACK_SIZE = java.lang.Integer.parseInt(newValue);
    }else {
        intensity.setText(oldValue);
    }
    processScheduler.logic.Strategy.TICKSFORMESSAGE = java.lang.Integer.parseInt(intensity.getText());
}