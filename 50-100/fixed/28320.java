public void removeDateFromTaskDetails(java.lang.String textToRemove) {
    textToRemove = cleanupExtraWhitespace(textToRemove);
    if (taskDetails.startsWith(textToRemove)) {
        taskDetails = Parser.CommandParser.cleanupExtraWhitespace(taskDetails.replaceFirst(textToRemove, ParserConstants.STRING_WHITESPACE));
    }else {
        taskDetails = Parser.CommandParser.cleanupExtraWhitespace(taskDetails.replaceFirst(((ParserConstants.STRING_WHITESPACE) + textToRemove), ParserConstants.STRING_WHITESPACE));
    }
}