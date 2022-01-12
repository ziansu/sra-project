public void removeTimeFromTaskDetails(java.lang.String textToRemove) {
    if (taskDetails.startsWith(textToRemove)) {
        taskDetails = Parser.CommandParser.cleanupExtraWhitespace(taskDetails.replaceFirst(textToRemove, ParserConstants.STRING_WHITESPACE));
    }else {
        taskDetails = Parser.CommandParser.cleanupExtraWhitespace(taskDetails.replaceFirst(textToRemove, ParserConstants.STRING_WHITESPACE));
    }
}