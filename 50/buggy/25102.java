public static java.lang.String lemmaStatic(java.lang.String word, java.lang.String tag, boolean lowercase) {
    edu.stanford.nlp.process.Morphology.initStaticLexer();
    return edu.stanford.nlp.process.Morphology.lemmatize(word, tag, edu.stanford.nlp.process.Morphology.staticLexer, lowercase);
}