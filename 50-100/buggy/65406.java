public void launchVocabGame(java.util.ArrayList<java.lang.String> titlesTopics, VocabularySystem.TypeOfGame type, int numberOfWords) {
    for (java.lang.String s : titlesTopics) {
        this.addSelectedTopic(s);
    }
    this.mergeTopicVocabulary();
    this.vocabGame = new VocabularySystem.VocabularyGame(this.selectedTopic, type, numberOfWords, this.modeleLogger);
    this.modeleLogger.addLog("MODELE A new game is launched.", LogLevel.INFO);
}