private java.util.List<by.dzmitry.model.entities.Word> getWordsForUser(java.lang.String name, java.lang.String questionType) {
    java.lang.String query = ((("SELECT w FROM Word w " + "WHERE w.userName='") + name) + "' ") + "AND w.studied=FALSE";
    java.util.List<by.dzmitry.model.entities.Word> words = wordsRepository.read(query, 30);
    return words;
}