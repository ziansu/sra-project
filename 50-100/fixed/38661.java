private void setFieldsDisabled(boolean b, java.lang.String buttonText) {
    minutes.setDisable(b);
    seconds.setDisable(b);
    if ("Start".equals(buttonText)) {
        setEndFieldsDisabled(b);
    }else {
        setStartFieldsDisabled(b);
    }
}