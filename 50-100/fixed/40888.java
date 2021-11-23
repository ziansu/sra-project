public void changed(javafx.beans.value.ObservableValue<? extends Definitions.Physician> ov, Definitions.Physician old_val, Definitions.Physician new_val) {
    int clicked = Directory.getSelectionModel().getSelectedIndex();
    if (clicked >= 0) {
        selectedHPIndex = clicked;
        selectedHP = new_val;
    }
    refreshLoc();
    refreshInfo();
}