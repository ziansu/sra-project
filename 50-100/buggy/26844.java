private void matchFilteredContained(java.lang.String uri, java.lang.String title) {
    for (java.lang.String word : title.split("\\s+")) {
        java.lang.System.err.println(word);
        if (((word.length()) >= (forskbot.irc.TitleSimilarity.WORDLEN_THRESH)) && (word.matches("\\w+"))) {
            (keywordsTotal)++;
            if (uri.contains(word)) {
                (keywordsContained)++;
            }
        }
    }
}