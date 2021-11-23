private main.Event decodeEditData(main.Event task, java.lang.String input) {
    java.lang.String remainingInput = extractDescription(task, input);
    if (input.isEmpty()) {
        return null;
    }
    if (remainingInput.isEmpty()) {
        return task;
    }
    task = determineQuotedInput(task, remainingInput);
    return decodeDataFromInput(task, remainingInput);
}