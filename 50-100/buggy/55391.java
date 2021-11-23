private double idf(java.util.List<java.util.List<java.lang.String>> docs, java.lang.String term) {
    double n = 0;
    for (java.util.List<java.lang.String> doc : docs) {
        for (java.lang.String word : doc) {
            if (term.equalsIgnoreCase(word)) {
                n++;
                break;
            }
        }
    }
    return java.lang.Math.log(((docs.size()) / n));
}