private void clearContents(final android.widget.EditText editTextNumbers, final android.widget.EditText editTextEquation) {
    numberWasPressed = false;
    operationWasPressed = false;
    isDecimalButtonAllowed = true;
    isSignButtonAllowed = true;
    isComputationDone = false;
    isPercentageButtonAllowed = false;
    refresh = false;
    changeOperationIsAllowed = false;
    percentageData = 0.0;
    inputCount = 0;
    inputNumber.setLength(0);
    initialState = false;
    editTextNumbers.setText("");
    editTextEquation.setText("");
}