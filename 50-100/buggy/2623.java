private int parseNumberOfRecurrence(java.lang.String commandText, java.lang.String numRecurrenceText) throws seedu.address.logic.parser.ParseException {
    int numRecurrence = 0;
    boolean parseError = false;
    try {
        numRecurrence = java.lang.Integer.parseInt(numRecurrenceText);
        if (numRecurrence < 0)
            parseError = true;
        
    } catch (java.lang.NumberFormatException ex) {
        parseError = true;
    }
    if (parseError)
        throw new seedu.address.logic.parser.ParseException(commandText, "NUMBER_OF_RECURRENCE: Must be a nonnegative whole number!");
    
    return numRecurrence;
}