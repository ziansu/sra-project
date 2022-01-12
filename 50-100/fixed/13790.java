public java.lang.String getKnownStem(java.lang.String query, java.lang.String language) {
    org.oscii.morph.Stemmer stemmer = stemmers.get(language);
    if (stemmer == null)
        return query;
    
    java.util.List<java.lang.String> stems = stemmer.getKnownStems(query);
    if (stems.isEmpty()) {
        return query;
    }else {
        return stems.get(0);
    }
}