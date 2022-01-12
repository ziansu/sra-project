public void launchVocabGameGraphic(java.util.ArrayList<java.lang.String> titlesTopics, VocabularySystem.TypeOfGame type, int numberOfWords, int numberOfPropositions, int life) {
    for (java.lang.String s : titlesTopics) {
        java.lang.System.out.println(s);
        this.addSelectedTopic(s);
    }
    this.mergeTopicVocabulary();
    this.vocabGameGraphic = new VocabularySystem.VocabularyGame2(this.selectedTopic, type, numberOfWords, numberOfPropositions, this.modeleLogger, life);
    this.modeleLogger.addLog("MODELE A new game is launched.", LogLevel.INFO);
}