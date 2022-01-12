public java.util.List<java.lang.String> searchAllWords() {
    final java.util.List<java.lang.String> listOfFoundWords = com.google.common.collect.Lists.newArrayList();
    final java.util.Set<java.lang.Character> characters = root.getChildren().keySet();
    for (java.lang.Character character : characters) {
        searchAllWords(character.toString(), root.getChild(character), listOfFoundWords);
    }
    return listOfFoundWords;
}