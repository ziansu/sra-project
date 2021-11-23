public void setValue(java.lang.Object value) {
    super.setValue(value);
    if (((text) != null) && (!(getText().equals(value)))) {
        ignoreListener = true;
        java.lang.String textValue = getText();
        text.setText((textValue != null ? textValue : ""));
        ignoreListener = false;
    }
}