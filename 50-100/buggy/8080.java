public java.util.List<lt.ru.lexio.db.Word> build(int wordCount, int page, java.util.Date toDate, lt.ru.lexio.ui.training.TrainingWordOrder[] wordOrder, lt.ru.lexio.ui.training.TrainingType trainingType) {
    java.util.List<lt.ru.lexio.db.Word> words = new java.util.ArrayList<>(wordCount);
    build(wordCount, page, toDate, trainingType, wordOrder, words);
    return words;
}