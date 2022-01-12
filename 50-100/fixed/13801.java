public static boolean isEmptyDateField(javafx.scene.control.DatePicker dateField) {
    boolean valid = true;
    javafx.collections.ObservableList<java.lang.String> styleClass = dateField.getStyleClass();
    if ((dateField.getValue()) == null) {
        if (!(styleClass.contains("error"))) {
            styleClass.add("error");
        }
    }else {
        styleClass.removeAll(java.util.Collections.singleton("error"));
        valid = false;
    }
    return valid;
}