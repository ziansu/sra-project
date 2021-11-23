private void findEditDistance() {
    int i = 0;
    for (java.lang.String inputWord : wordsNotFound) {
        findSimilarAlternation(inputWord);
        findSimilarDeletion(inputWord);
        findSimilarInsertion(inputWord);
        findSimilarTransposition(inputWord);
        i++;
    }
    swapNotFoundLists();
}