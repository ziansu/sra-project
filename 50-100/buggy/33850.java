private void calculateKlScores() {
    int totalNumberOfTermsInCollection = ((int) (searcher.getNumberOfTermsInCollection()));
    org.elasticsearch.plugin.TermData[] calculatedKlScores = new org.elasticsearch.plugin.TermData[searchHits.length];
    int index = 0;
    for (org.elasticsearch.plugin.TermData termData : terms.values()) {
        termData.calculateKlScore(totalNumberOfTermsInTopKDocuments, totalNumberOfTermsInCollection);
        calculatedKlScores[index] = termData;
        index++;
    }
    java.util.Arrays.sort(calculatedKlScores);
    queryUtil.setScoredTerms(calculatedKlScores);
}