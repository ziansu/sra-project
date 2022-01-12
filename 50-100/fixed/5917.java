private static void putSubtitleInHashMap(java.lang.String word) {
    if (!(common.StopWords.isStopWord(word))) {
        java.lang.Integer freq = PDFContainer.wordsOccurence.get(word);
        if (freq == null) {
            (frontend.app.TextProcessor.wordsInserted)++;
            PDFContainer.wordsOccurence.put(word, 0);
        }
    }
}