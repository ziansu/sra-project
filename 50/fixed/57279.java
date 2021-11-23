@java.lang.Override
protected void searchOnChange(java.lang.String newValue) {
    if ((onChange) && (newValue != null)) {
        act(newValue.split("\\s+"));
    }
}