private static void putSubtitleInHashMap(java.lang.String word) {
    if (!(common.StopWords.isStopWord(word))) {
        java.lang.Integer freq = PDFContainer.wordsOccurence.get(word);
        if (freq == null) {
            if ((frontend.app.TextProcessor.wordsInserted) < (common.PDFContainer.numberOfWordsToInsert)) {
                PDFContainer.wordsOccurence.put(word, 0);
                (frontend.app.TextProcessor.wordsInserted)++;
            }else
                if ((common.PDFContainer.numberOfWordsToInsert) == 0) {
                    PDFContainer.wordsOccurence.put(word, 0);
                }
            
        }
    }
}