private void leastTestedTest() {
    com.tkomiya.models.VocabList testingList = com.tkomiya.models.utils.VocabListUtils.getLeastTestedVocabList(vocabLists, com.tkomiya.main.MainController.TESTING_LANGUAGE);
    new com.tkomiya.views.TypedTest(testingList, com.tkomiya.main.MainController.TESTING_LANGUAGE);
}