private void initialize() {
    if (!(initialized)) {
        nl.basjes.parse.useragent.UserAgentAnalyzer.Builder analyzerBuilder = nl.basjes.parse.useragent.UserAgentAnalyzer.newBuilder();
        analyzerBuilder.hideMatcherLoadStats();
        if ((cacheSize) >= 0) {
            analyzerBuilder.withCache(cacheSize);
        }
        if ((requestedFields) != null) {
            for (java.lang.String requestedField : requestedFields) {
                analyzerBuilder.withField(requestedField);
            }
        }
        analyzer = analyzerBuilder.build();
        nl.basjes.parse.useragent.pig.ParseUserAgent.allFieldNames = analyzer.getAllPossibleFieldNamesSorted();
        initialized = true;
    }
}