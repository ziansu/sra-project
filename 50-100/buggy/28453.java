@java.lang.Override
public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
    java.lang.String text = stringInputText.getText();
    if (!(text.equals(""))) {
        filterParameters.put(parameterName, text);
        validateFilterParameters(filter);
    }else {
        filterParameters.put(parameterName, null);
        setValidationErrorMessage((parameterName + " must be an non-empty string."));
        applyFilterButton.setEnabled(false);
    }
}