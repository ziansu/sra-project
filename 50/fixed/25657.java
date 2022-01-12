private void updateWords() {
    cleanAll();
    createTitle();
    for (java.lang.String word : wordsAndID.keySet())
        addWord(word, wordsAndID.get(word));
    
}