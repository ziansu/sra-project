void setOptions(java.lang.String def) {
    if (def != null) {
        stringValue = new javafx.scene.control.TextField();
        stringValue.setPromptText(def);
        setRight(stringValue);
    }
}