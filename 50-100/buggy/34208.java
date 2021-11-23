private main.Event decodeEditData(main.Event task, java.lang.String input) {
    java.lang.String remainingInput = extractDescription(task, input);
    if (remainingInput.isEmpty()) {
        return null;
    }
    task = determineQuotedInput(task, remainingInput);
    return decodeDataFromInput(task, remainingInput);
}