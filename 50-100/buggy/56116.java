private java.util.HashMap<java.lang.String, java.lang.Double> calculateIDFScores() {
    java.util.HashMap<java.lang.String, java.lang.Double> IDFScoreMap = new java.util.HashMap<>();
    long totalDocuments = searchFromLucene.getTotalDocumentCount();
    for (java.lang.String word : reviewVocabulary) {
        double termDocCount = (searchFromLucene.getDocumentCountContainingWord(word)) * 1.0;
        double idfScore = java.lang.Math.log((totalDocuments / termDocCount));
        IDFScoreMap.put(word, idfScore);
    }
    return IDFScoreMap;
}