@java.lang.Override
public void keyReleased(org.eclipse.swt.events.KeyEvent e) {
    try {
        filterParameters.put(parameterName, java.lang.Double.parseDouble(doubleInputText.getText()));
        validateFilterParameters(filter);
    } catch (java.lang.Exception ex) {
        setValidationErrorMessage((parameterName + " must be a double."));
        applyFilterButton.setEnabled(false);
    }
}