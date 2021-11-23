@java.lang.Override
protected void searchOnChange(java.lang.String newValue) {
    if (onChange) {
        act(newValue.split("\\s+"));
    }
}