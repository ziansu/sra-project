private void findErrorCausingWords(java.util.List<com.joestelmach.natty.DateGroup> groups) {
    for (com.joestelmach.natty.DateGroup group : groups) {
        if (hasErrorCausingWord(group)) {
            isIncorrectlyParsingWords = true;
            incorrectlyParsedWord = getIncorrectlyParsedWord(group);
            main.java.DateParser.logger.log(java.util.logging.Level.INFO, "Offending word: {0}", incorrectlyParsedWord);
            break;
        }
    }
}