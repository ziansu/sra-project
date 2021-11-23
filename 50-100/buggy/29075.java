private void addToInvertedIndex(java.lang.String word) {
    java.lang.String basicWord = word.replaceAll("[^A-Za-z0-9]", "");
    basicWord = basicWord.toLowerCase();
    if (wordOccurrences.containsKey(basicWord)) {
        int tmp = wordOccurrences.get(basicWord);
        wordOccurrences.put(basicWord, (tmp += 1));
    }else {
        wordOccurrences.put(basicWord, 1);
    }
}