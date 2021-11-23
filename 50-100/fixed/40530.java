private org.sosy_lab.cpachecker.core.algorithm.pcc.AlgorithmStatus resultCheckingWithoutWritingProof(final org.sosy_lab.cpachecker.core.reachedset.ReachedSet pVerificationResult) throws java.lang.InterruptedException, org.sosy_lab.common.configuration.InvalidConfigurationException, org.sosy_lab.cpachecker.exceptions.CPAException {
    stats.checkTimer.start();
    org.sosy_lab.cpachecker.core.algorithm.pcc.ProofCheckAlgorithm checker = new org.sosy_lab.cpachecker.core.algorithm.pcc.ProofCheckAlgorithm(cpa, config, logger, shutdownNotifier, pVerificationResult, analyzedProgram);
    stats.checkingStatsProvider = checker;
    return checker.run(initializeReachedSetForChecking(config, cpa));
}