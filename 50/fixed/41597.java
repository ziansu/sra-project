private java.util.List<java.lang.String> tokenizeText() {
    corpus.sinhala.SinhalaTokenizer tokenizer = new corpus.sinhala.SinhalaTokenizer();
    return tokenizer.splitWords(fixedText);
}