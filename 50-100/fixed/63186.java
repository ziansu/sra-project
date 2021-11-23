public java.util.List<java.lang.String> searchAllWords() {
    final java.util.List<java.lang.String> listOfFoundWords = new java.util.ArrayList<java.lang.String>();
    final java.util.Set<java.lang.Character> characters = root.getChildren().keySet();
    for (java.lang.Character character : characters) {
        searchAllWords(character.toString(), root.getChild(character), listOfFoundWords);
    }
    return listOfFoundWords;
}