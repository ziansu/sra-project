public static java.lang.String findStringFromStringBetweenSearchTerms(java.lang.String original, java.lang.String beginingSearchTerm, java.lang.String endSearchTerm) {
    int offsetOfBeginningSearchTerm = beginingSearchTerm.length();
    int startSearchResult = original.indexOf(beginingSearchTerm);
    int endSearchResult = original.indexOf(endSearchTerm, (startSearchResult + 1));
    int startOfResultString = startSearchResult + offsetOfBeginningSearchTerm;
    return ((java.lang.String) (original.subSequence(startOfResultString, endSearchResult)));
}