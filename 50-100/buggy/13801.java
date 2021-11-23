public static boolean isEmptyDateField(javafx.scene.control.DatePicker dateField, javafx.scene.control.Label error) {
    boolean valid = false;
    javafx.collections.ObservableList<java.lang.String> styleClass = dateField.getStyleClass();
    if ((dateField.getValue()) == null) {
        if (!(styleClass.contains("error"))) {
            styleClass.add("error");
        }
    }else {
        styleClass.removeAll(java.util.Collections.singleton("error"));
        valid = true;
    }
    return valid;
}