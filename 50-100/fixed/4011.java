private static java.lang.String[] getAllPossibleSuggestionsAsArray() {
    java.util.List<java.lang.String> allPossibleSuggestions = org.openmrs.module.chartsearch.GeneratingJson.chartSearchService.getAllPossibleSearchSuggestions(org.openmrs.module.chartsearch.SearchAPI.getPatientId());
    java.lang.String[] searchSuggestions = new java.lang.String[allPossibleSuggestions.size()];
    searchSuggestions = ((java.lang.String[]) (allPossibleSuggestions.toArray(searchSuggestions)));
    return searchSuggestions;
}