public void setIntermediateScores(java.util.HashMap<java.lang.Integer, java.lang.Double> intermediateScores) {
    zooActivateWrite();
    setModified(true);
    this.intermediateScores = intermediateScores;
}