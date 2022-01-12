public static java.util.List<com.xdrop.fuzzywuzzy.model.ExtractedResult> extractWithoutOrder(java.lang.String query, java.util.Collection<java.lang.String> choices) {
    com.xdrop.fuzzywuzzy.Extractor extractor = new com.xdrop.fuzzywuzzy.Extractor();
    return extractor.extractWithoutOrder(query, choices, new com.xdrop.fuzzywuzzy.algorithms.WeightedRatio());
}