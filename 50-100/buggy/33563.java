public java.util.List<java.lang.String> createList(int listSize) {
    java.util.Random rand = new java.util.Random();
    java.util.List<java.lang.String> wordList = rand.ints(listSize, 0, (listSize - 1)).mapToObj(( i) -> sourceWords.get(i)).collect(java.util.stream.Collectors.toList());
    return wordList;
}