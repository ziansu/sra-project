@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.String> observable, java.lang.String oldValue, java.lang.String newValue) {
    if ((lstInput.getSelectionModel().getSelectedItem()) != null) {
        if (!(controller.checkGerecht(lstInput.getSelectionModel().getSelectedItem().toString()))) {
            btnPasProductAan.setVisible(false);
        }else {
            btnPasProductAan.setVisible(true);
        }
    }
}