@java.lang.Override
public synchronized nl.bknopper.tspeademo.ea.CandidateSolution getCurrentBest(boolean forceRetrieval) throws java.lang.IllegalStateException {
    if (forceRetrieval || (isStillRunning())) {
        nl.bknopper.tspeademo.ea.CandidateSolution currentBest = null;
        for (nl.bknopper.tspeademo.ea.AlgorithmRunner runner : runners) {
            nl.bknopper.tspeademo.ea.CandidateSolution runnersBest = runner.getCurrentBest(forceRetrieval);
            if (currentBest == null) {
                currentBest = runnersBest;
            }else
                if ((runnersBest != null) && ((runnersBest.compareTo(currentBest)) > 0)) {
                    currentBest = runnersBest;
                }
            
        }
        return currentBest;
    }
    throw new java.lang.IllegalStateException("No Algorithm running at this point in time. Please start one.");
}