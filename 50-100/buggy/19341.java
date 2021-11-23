@java.lang.Override
protected void updateProgress() {
    if (getDynamicProblem().hasTheProblemBeenModified()) {
        restart(100);
        getDynamicProblem().reset();
    }
    evaluations += org.uma.jmetalsp.algorithm.mocell.DynamicMOCell.getMaxPopulationSize();
    (completedIterations)++;
    currentIndividual = ((currentIndividual) + 1) % (org.uma.jmetalsp.algorithm.mocell.DynamicMOCell.getMaxPopulationSize());
}