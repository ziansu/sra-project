private double getNumQueryTerms(java.lang.String query, java.lang.String sentence) {
    java.lang.String[] splitQuery = query.toLowerCase().split("\\s");
    java.util.Set<java.lang.String> uniqueQuery = new java.util.HashSet<>();
    int count = 0;
    for (java.lang.String word : splitQuery) {
        uniqueQuery.add(word);
    }
    for (java.lang.String queryWord : uniqueQuery) {
        count += org.apache.commons.lang.StringUtils.countMatches(sentence.toLowerCase(), queryWord);
    }
    return count;
}