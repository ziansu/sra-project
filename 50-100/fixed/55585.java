private void handleUserInput() {
    java.lang.String inputString = userInput.getText();
    if (containsEditAll(inputString)) {
        java.util.ArrayList<java.time.LocalDate> exceptionDates = extractExceptionDates(inputString);
        if ((exceptionDates != null) && ((exceptionDates.size()) > 0)) {
            inputString = buildExceptStringToAdd(inputString, exceptionDates);
        }
    }
    controller.executeCommand(inputString);
    updateHistory();
    updateUserInput(EMPTY_STRING);
}