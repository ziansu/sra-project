@java.lang.Override
public void setSelectedIndex(final int index) {
    programmaticTextChange = true;
    if (index > (-1)) {
        getUiReference().select(index);
    }else {
        getUiReference().deselect(getUiReference().getSelectionIndex());
    }
    programmaticTextChange = false;
    if (!(getUiReference().isFocusControl())) {
        fireInputChanged(getUiReference().getText());
    }
}