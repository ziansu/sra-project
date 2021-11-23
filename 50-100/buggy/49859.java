public static void updateVocab(java.util.Map<java.lang.String, java.lang.Integer> vocab, java.lang.String word, int count) {
    if (vocab.containsKey(word)) {
        vocab.put(word, ((vocab.get(word)) + count));
    }else {
        vocab.put(word, 1);
    }
}