public java.util.List<java.util.List<java.lang.String>> createSentencesFromText(java.lang.String document) throws eu.innovationengineering.lang.exceptions.LanguageException {
    java.util.List<java.util.List<java.lang.String>> sentecesList = new java.util.ArrayList<java.util.List<java.lang.String>>();
    eu.innovationengineering.nlp.analyzer.stanfordnlp.StanfordnlpAnalyzer nlpAnalyzer = new eu.innovationengineering.nlp.analyzer.stanfordnlp.StanfordnlpAnalyzer();
    java.util.List<java.lang.String> senteces = nlpAnalyzer.detectSentences(document, ISO_639_1_LanguageCode.ENGLISH);
    eu.innovation.engineering.LSA.keywordExtractor.Lemmatizer lemmatizer = new eu.innovation.engineering.LSA.keywordExtractor.Lemmatizer();
    for (java.lang.String sentence : senteces) {
        sentecesList.add(cleanAndSplitSentence(sentence, lemmatizer));
    }
    return sentecesList;
}