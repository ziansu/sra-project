private static java.util.ArrayList<java.lang.String> stemTerms(java.util.ArrayList<java.lang.String> tokens, org.tartarus.snowball.SnowballStemmer stemmer) {
    java.util.ArrayList<java.lang.String> terms = new java.util.ArrayList<>();
    for (java.lang.String term : tokens) {
        terms.add(processor.Preprocessor.stemTerm(term, stemmer));
    }
    return terms;
}