private com.onpositive.text.analysis.EuristicAnalyzingParser configureDefaultAnalyzer(java.util.List<com.onpositive.text.analysis.Euristic> euristics) {
    com.onpositive.text.analysis.EuristicAnalyzingParser euristicAnalyzingParser = new com.onpositive.text.analysis.EuristicAnalyzingParser(euristics);
    euristicAnalyzingParser.addTokenFilter(new com.onpositive.text.analysis.filtering.AbbreviationsFilter());
    euristicAnalyzingParser.addProjectionCreator(new com.onpositive.text.analysis.projection.creators.NotPartRemover());
    return euristicAnalyzingParser;
}