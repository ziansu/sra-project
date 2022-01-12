private javafx.collections.ObservableList<java.lang.Integer> populateTrackNumberComboBox() {
    javafx.collections.ObservableList<java.lang.Integer> options;
    if ((ui.Slave.getSequence()) != null) {
        options = javafx.collections.FXCollections.observableArrayList();
        for (int i = 0; i < (ui.Slave.getSequence().getTracks().length); i++) {
            java.lang.System.out.println(i);
            options.add(i);
        }
    }else {
        options = javafx.collections.FXCollections.observableArrayList(0);
    }
    return options;
}