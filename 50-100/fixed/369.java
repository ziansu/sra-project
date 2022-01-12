public java.util.TreeMap<java.lang.Integer, java.util.TreeMap<java.lang.String, java.lang.Integer>> retrieveOverallCoordData() {
    java.util.TreeMap<java.lang.Integer, java.util.TreeMap<java.lang.String, java.lang.Integer>> overall = new java.util.TreeMap<>();
    overall.putAll(coordinateDepDao.findOverallDataCollected("oldprocessedcoord"));
    overall.putAll(coordinateDepDao.findOverallDataCollected(coordViewTable));
    return overall;
}