public void prepareForWork() {
    indicesDepth = java.lang.Math.min(indicesDepth, editor.Dictionary.INDICES_DEPTH);
    java.util.Arrays.sort(words, editor.Word.getWordComparator());
    baseIndex = new editor.Dictionary.Index(0, words.length, "", 0);
    baseIndex.split();
    baseIndex.prepare();
}