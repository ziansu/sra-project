private seedu.address.logic.parser.DateParser.InferredDate parseEndDate(java.lang.String commandText, java.lang.String dateText) throws seedu.address.logic.parser.ParseException {
    try {
        if (dateText == null)
            return null;
        
        return dateParser.parseSingle(dateText);
    } catch (seedu.address.logic.parser.ParseException ex) {
        throw new seedu.address.logic.parser.ParseException(commandText, ("END_DATE: " + (ex.getFailureDetails())));
    }
}