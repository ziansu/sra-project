public java.lang.String getSentences(int numSentences) {
    if (numSentences < 1) {
        return "";
    }
    java.lang.String buffer = "";
    for (int i = 0; i < numSentences; i++) {
        buffer += (getWords(((minSentenceLength) + (r.nextInt(upperRandom))))) + ".";
        if ((i + 1) < numSentences) {
            buffer += " ";
        }
    }
    return buffer;
}