private void addToInvertedIndex(java.lang.String word) {
    if (wordOccurrences.containsKey(word)) {
        int tmp = wordOccurrences.get(word);
        wordOccurrences.put(word, (tmp += 1));
    }else {
        wordOccurrences.put(word, 1);
    }
}