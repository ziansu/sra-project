public void extractEndDate() {
    int indexOfPrefix = commandArgumentsString.indexOf(COMMAND_PREFIX_ENDDATE);
    if (isValidArguments) {
        parser.DateTimeParser endDateTimeParser = new parser.DateTimeParser(DATETIMEPARSER_INDICATOR_END, commandArgumentsString);
        commandArgumentsString = commandArgumentsString.replace(endDateTimeParser.getString(), STRING_EMPTY);
        itemEndDate = endDateTimeParser.getDate();
        itemEndDateTitle = endDateTimeParser.getString();
        if ((!(isValidDate(itemEndDate))) && (isValidIndex(indexOfPrefix))) {
            isValidArguments = isValidDate(itemEndDate);
        }
    }
}