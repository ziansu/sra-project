public void saveUserInput(java.lang.String input) {
    userInputHistory.addFirst(input);
    resetIterator();
    logger.info(("Capturing user input: " + input));
}