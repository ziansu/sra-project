public double tf(java.util.List<java.lang.String> doc, java.lang.String term) {
    int result = 0;
    for (java.lang.String word : doc) {
        if (term.equalsIgnoreCase(word)) {
            result++;
        }
    }
    return ((double) (result)) / (doc.size());
}