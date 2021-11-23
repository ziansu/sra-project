private void updateWords() {
    cleanAll();
    createTitle();
    for (java.lang.String word : wordsAndID.keySet())
        rowsCreator.addWord(word);
    
}