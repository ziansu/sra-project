public void createTask(java.lang.String[] words) {
    java.lang.String tLabel = wordsToSentence(java.util.Arrays.copyOfRange(words, 2, words.length));
    uk.ac.gla.focuswatch.model.Task newT = new uk.ac.gla.focuswatch.model.Task(((tasks.size()) + 1), tLabel);
    addToAdapter(newT);
}