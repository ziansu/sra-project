public void parse(java.lang.String input) {
    initVariables(input);
    main.java.DateParser.logger.log(java.util.logging.Level.INFO, ("Input: " + input));
    input = getWordsOutsideEscapeChars(input);
    java.util.List<com.joestelmach.natty.DateGroup> groups = parser.parse(input);
    findErrorCausingWords(groups);
    if (isIncorrectlyParsingWords) {
        input = modifyInput(input);
        parse(input);
    }else {
        generateDatesAndParsedWords(groups);
        removeNonChronologicalDates();
    }
}