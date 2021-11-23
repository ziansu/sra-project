private static java.util.ArrayList<java.lang.String> stemTerms(java.util.ArrayList<java.lang.String> tokens, processor.Preprocessor stemmer) throws java.lang.Exception {
    java.util.ArrayList<java.lang.String> terms = new java.util.ArrayList<>();
    for (java.lang.String term : tokens) {
        terms.add(stemmer.stemTerm(term));
    }
    return terms;
}