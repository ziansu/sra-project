public java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Double>> estimateRelevances(java.util.List<java.lang.Integer> startCategories, int topKShortestPathes, boolean distributeOverSiblingCategories) {
    java.util.List<java.util.List<java.util.List<grph.path.ArrayListPath>>> sourcesToTargetsPathes = yenTopKShortestPaths(startCategories, topKShortestPathes);
    java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, java.lang.Double>> relevances = calculateProbabilites(startCategories, sourcesToTargetsPathes, distributeOverSiblingCategories);
    return relevances;
}