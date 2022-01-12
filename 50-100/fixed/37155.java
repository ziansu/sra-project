private void iterations() {
    int iterationCount = 0;
    while ((((clusteringStrategy.getTerminationCondition()) != null) && (!(clusteringStrategy.getTerminationCondition().isSatisfied(iterationHistory)))) || (iterationHistory.getMostRecentIterationInfo().isStrategyApplied())) {
        (currentIteration)++;
        removePoints();
        classifyPoints();
        applyClusteringStrategy();
        org.deeplearning4j.clustering.algorithm.BaseClusteringAlgorithm.log.info("Completed clustering iteration {}", (++iterationCount));
    } 
}