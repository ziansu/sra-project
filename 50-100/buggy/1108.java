public void printSuggestedWords(java.util.HashMap<java.lang.String, java.lang.String> words) {
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : words.entrySet()) {
        java.lang.String score = entry.getValue().substring(0, entry.getValue().indexOf(" "));
        java.lang.String words = entry.getValue().substring(entry.getValue().indexOf(" ")).replace(" ", ScrabbleTeam3.ScrabbleWordSuggester.WORDS_SEPERATOR);
        java.lang.System.out.println(((score + " - ") + words));
    }
}