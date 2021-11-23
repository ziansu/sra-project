public int askQuestion(java.lang.String question, int startRange) throws jean.TooBigForIntegerException {
    try {
        return askQuestion(question, startRange, java.lang.Integer.MAX_VALUE);
    } catch (jean.TooBigForIntegerException we) {
        return askQuestion(question, startRange, ((java.lang.Integer.MAX_VALUE) - 1));
    }
}