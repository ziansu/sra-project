private duplicatesearcher.Token mostCommonWord(java.util.SortedSet<java.lang.String> synonyms) {
    duplicatesearcher.Token mostCommon = null;
    int occurencesMostCommon = 0;
    for (java.lang.String synonym : synonyms) {
        final duplicatesearcher.Token token = new duplicatesearcher.Token(synonym);
        final int frequency = termFreq.getTokenFrequency(token);
        if (frequency > occurencesMostCommon) {
            mostCommon = token;
            occurencesMostCommon = frequency;
        }
    }
    return mostCommon;
}