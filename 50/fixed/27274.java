public void doFullIndexing() {
    java.util.List<java.lang.String> vocabularyIds = termedApiService.fetchAllAvailableVocabularyIds();
    for (java.lang.String vocId : vocabularyIds) {
        indexListOfConceptsInVocabulary(vocId, false);
    }
}