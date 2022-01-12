private java.util.List<grph.path.ArrayListPath> copyOfCachedPaths(int topK, eu.eexcess.diversityasurement.wikipedia.MainCategoryRelevanceEstimator.PathMapKey pathOfInterest) {
    eu.eexcess.diversityasurement.wikipedia.MainCategoryRelevanceEstimator.KShortestPaths cachedKPaths = cachedTopKShortestPaths.get(pathOfInterest);
    if (null != cachedKPaths) {
        if (topK <= (cachedKPaths.k)) {
            return copyOfShortestPaths(topK, cachedKPaths);
        }
    }
    return null;
}