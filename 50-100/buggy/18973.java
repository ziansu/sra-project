public java.lang.String toSentenceCase(java.lang.String text) {
    if (text == null) {
        throw new java.lang.NullPointerException();
    }
    java.lang.String textTrimmed = text.trim();
    if (textTrimmed.isEmpty()) {
        return textTrimmed;
    }
    java.lang.String sentenceCase = textTrimmed.substring(0, 1).toUpperCase();
    if ((textTrimmed.length()) > 1) {
        sentenceCase += sentenceCase.substring(1).toLowerCase();
    }
    return sentenceCase;
}