public double perplexity(java.util.ArrayList<java.lang.String> sentences, int n) {
    return ((probabilityOfDocument(sentences, n)) * (-1.0)) / n;
}