public java.lang.String getSentences(int numSentences) {
    if (numSentences < 1) {
        return "";
    }
    java.lang.StringBuilder buffer = new java.lang.StringBuilder();
    for (int i = 0; i < numSentences; i++) {
        buffer.append(((getWords(((minSentenceLength) + (r.nextInt(upperRandom))))) + "."));
        if ((i + 1) < numSentences) {
            buffer.append(" ");
        }
    }
    return buffer.toString();
}