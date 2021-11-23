@java.lang.Override
protected void updateProgress() {
    if (getDynamicProblem().hasTheProblemBeenModified()) {
        restart(100);
        getDynamicProblem().reset();
    }
    int cont = org.uma.jmetalsp.algorithm.smpso.DynamicSMPSO.getIterations();
    this.setIterations((cont + 1));
    org.uma.jmetalsp.algorithm.smpso.DynamicSMPSO.updateLeadersDensityEstimator();
}