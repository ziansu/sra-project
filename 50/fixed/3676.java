@java.lang.Override
public void focusLost(final org.mihalis.opal.horizontalSpinner.FocusEvent e) {
    if (text.getText().trim().equals("")) {
        setSelection(storedValue);
    }
}