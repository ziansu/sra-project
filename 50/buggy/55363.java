public java.lang.String[] getWordsPair(java.lang.String triggerAction) {
    com.ardeleanlucian.dutchflashcards.model.FileReader fileReader = new com.ardeleanlucian.dutchflashcards.model.FileReader(context, prefs.readLatestWord(), prefs.readDifficultyLevel());
    fileReader.readFile(triggerAction);
    return fileReader.getWordsPair();
}