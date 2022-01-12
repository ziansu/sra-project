private java.util.Map<java.lang.String, java.lang.Integer> countTypesInSet(java.lang.String[] tokens, java.util.Set<java.lang.String> lexicon) {
    java.util.Map<java.lang.String, java.lang.Integer> counts = new java.util.HashMap<java.lang.String, java.lang.Integer>();
    for (int i = 0; i < (tokens.length); i++) {
        java.lang.String token = tokens[i].toLowerCase();
        if (lexicon.contains(token))
            addTokenToCounts(token, counts);
        
    }
    return counts;
}