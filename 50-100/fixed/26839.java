public static boolean checkSynonyms(langanal.word.base.Word word1, langanal.word.base.Word word2) {
    for (java.lang.String s : langanal.word.processing.WordProcessing.splitThesaurusWords(word1.getSynonyms())) {
        if (s.equals(word2.toString())) {
            return true;
        }
    }
    for (java.lang.String s : langanal.word.processing.WordProcessing.splitThesaurusWords(word2.getSynonyms())) {
        if (s.equals(word1.toString())) {
            return true;
        }
    }
    return false;
}