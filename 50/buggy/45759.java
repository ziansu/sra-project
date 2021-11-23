private void setFieldsDisabled(boolean enabled, java.lang.String buttonText) {
    minutes.setDisable(enabled);
    seconds.setDisable(enabled);
    if ("Start".equals(buttonText)) {
        setEndFieldsDisabled(enabled);
    }else {
        setStartFieldsDisabled(enabled);
    }
}