public double getPeptideScore() {
    zooActivateRead();
    zooActivateRead();
    return eu.isas.peptideshaker.parameters.PSParameter.getScore(peptideProbabilityScore);
}