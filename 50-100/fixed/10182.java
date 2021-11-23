private int getWordId(@javax.annotation.Nonnull
final java.lang.String word) {
    if (word2index.containsKey(word)) {
        return word2index.get(word);
    }else {
        int w = word2index.size();
        word2index.put(word, w);
        return w;
    }
}