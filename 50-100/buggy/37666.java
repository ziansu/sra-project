private boolean checkIfVocabListExists(java.io.File file) {
    java.lang.String vocabListName = com.tkomiya.infrastructure.FileUtilities.getFileNameWithNoExtension(file);
    java.util.List<com.tkomiya.models.VocabList> vocabLists = this.vocabLists.getList();
    for (com.tkomiya.models.VocabList vocabList : vocabLists) {
        if (vocabList.getName().equals(vocabListName)) {
            return true;
        }
    }
    return false;
}