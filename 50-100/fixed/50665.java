private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> listMapToMapTotalWordCount(java.util.List<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>> docsList) {
    java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> wordsCountMap = new java.util.TreeMap<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>();
    for (java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> docMap : docsList) {
        joinMaps(wordsCountMap, docMap);
    }
    return wordsCountMap;
}