public boolean solve() throws de.uni_freiburg.informatik.ultimate.automata.AutomataOperationCanceledException {
    mLogger.info("starting solver");
    propagateAll();
    makeModificationsPersistent();
    while (!(mUnsetVariables.isEmpty())) {
        decideOne();
        if (mConjunctionEquivalentToFalse) {
            return false;
        }
        if (!(mServices.getProgressMonitorService().continueProcessing())) {
            throw new de.uni_freiburg.informatik.ultimate.automata.AutomataOperationCanceledException(this.getClass());
        }
    } 
    mLogger.info("finished solver");
    log();
    return true;
}