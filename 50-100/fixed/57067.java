public void run() {
    int[] selectedIndexes = wordListField.getSelection();
    for (int i = 0; i < (selectedIndexes.length); i++) {
        java.lang.String word = wordListField.get(wordListField, selectedIndexes[i]).toString();
        wordVec.removeElement(word);
    }
    words = wordListVectorToArray(wordVec);
    wordListField.set(words);
}