public synchronized void createIntermediateScoreMap() {
    zooActivateWrite();
    if ((intermediateScores) == null) {
        intermediateScores = new java.util.HashMap<java.lang.Integer, java.lang.Double>();
    }
}