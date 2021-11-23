public void removeRange(int rowNumber, boolean problematicCheckboxSelected) {
    recalculateSumOfKanji(com.kanji.controllers.LearningStartController.AddOrDelete.DELETE);
    rangeOfKanjiInRow.remove(rowNumber);
    recalculateSumOfKanji(com.kanji.controllers.LearningStartController.AddOrDelete.ADD);
    learningStartPanel.updateSumOfWords(getSumOfWords());
}