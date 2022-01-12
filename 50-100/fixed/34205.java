@java.lang.Override
public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
    try {
        filterParameters.put(parameterName, java.lang.Integer.parseInt(integerInputText.getText()));
        validateFilterParameters(filter);
    } catch (java.lang.Exception ex) {
        setValidationErrorMessage((parameterName + " must be an integer."));
        applyFilterButton.setEnabled(false);
    }
}