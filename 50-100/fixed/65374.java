public java.util.ArrayList<java.lang.String> getNonStopWords() {
    if ((nonStopWords) == null) {
        nonStopWords = new java.util.ArrayList<java.lang.String>();
        for (Sentence s : this.sentences) {
            nonStopWords.addAll(s.getNonStopWords());
        }
    }
    return nonStopWords;
}