private static com.github.sharispe.slib.dsm.core.engine.CoOccurrenceEngineTheads.Word getNextWord(int[] text, int start, java.util.List<com.github.sharispe.slib.dsm.core.engine.VocabularyIndex.TokenNode> tokenNodeHistory, com.github.sharispe.slib.dsm.core.engine.VocabularyIndex index) {
    com.github.sharispe.slib.dsm.core.engine.CoOccurrenceEngineTheads.Word r = null;
    while ((start < (text.length)) && (r == null)) {
        r = com.github.sharispe.slib.dsm.core.engine.CoOccurrenceEngineTheads.getNextWordInner(text, start, tokenNodeHistory, index);
        tokenNodeHistory = null;
        start++;
    } 
    return r;
}