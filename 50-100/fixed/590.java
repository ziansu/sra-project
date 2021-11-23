private void findErrorCausingWords(java.util.List<com.joestelmach.natty.DateGroup> groups) {
    for (com.joestelmach.natty.DateGroup group : groups) {
        incorrectlyParsedWord = getIncorrectlyParsedWord(group);
        if ((incorrectlyParsedWord) != null) {
            isIncorrectlyParsingWords = true;
            main.java.DateParser.logger.log(java.util.logging.Level.INFO, "Offending word: {0}", incorrectlyParsedWord);
            break;
        }
    }
}