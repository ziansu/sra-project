private java.util.LinkedList<java.lang.String> tokenizeText() {
    corpus.sinhala.SinhalaTokenizer tokenizer = new corpus.sinhala.SinhalaTokenizer();
    java.util.LinkedList<java.lang.String> tokenizedwords = tokenizer.splitWords(fixedText);
    return tokenizedwords;
}