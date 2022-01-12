public java.util.Set<java.lang.Integer> chooseCardsToTestIndexesForTest2() {
    setAnswerDataByStudyItemsContainer();
    java.util.Set<java.lang.Integer> cardsToTestIndexes = new java.util.HashSet<java.lang.Integer>();
    cardsToTestIndexes = getLatestQuestionedCardIndexes(6);
    java.util.Set<java.lang.Integer> indexesToAdd;
    indexesToAdd = getRandomHardestCardIndexes(0.2, 6, cardsToTestIndexes);
    cardsToTestIndexes.addAll(indexesToAdd);
    indexesToAdd = getRandomCardIndexes(8, cardsToTestIndexes);
    cardsToTestIndexes.addAll(indexesToAdd);
    return cardsToTestIndexes;
}