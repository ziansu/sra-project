public void setValue(java.lang.Object value) {
    super.setValue(value);
    if ((text) != null) {
        ignoreListener = true;
        java.lang.String textValue = getText();
        text.setText((textValue != null ? textValue : ""));
        ignoreListener = false;
    }
}