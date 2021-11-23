public static edu.stanford.nlp.ling.WordTag stemStatic(java.lang.String word, java.lang.String tag) {
    edu.stanford.nlp.process.Morphology.initStaticLexer();
    return new edu.stanford.nlp.ling.WordTag(edu.stanford.nlp.process.Morphology.lemmatize(word, tag, edu.stanford.nlp.process.Morphology.staticLexer, edu.stanford.nlp.process.Morphology.staticLexer.option(1)), tag);
}