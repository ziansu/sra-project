public java.lang.String[] getWordsPair(java.lang.String triggerAction) {
    com.ardeleanlucian.dutchflashcards.model.FileReader fileReader = new com.ardeleanlucian.dutchflashcards.model.FileReader(context);
    fileReader.readFile(triggerAction, prefs.readLatestWord(), prefs.readDifficultyLevel());
    return fileReader.getWordsPair();
}