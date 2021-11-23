public void initiateProcessing(long reNum, java.lang.Object message) throws java.lang.Throwable {
    try {
        com.pslcl.dtf.runner.process.RunEntryState reState = new com.pslcl.dtf.runner.process.RunEntryState(reNum, message);
        com.pslcl.dtf.runner.process.Action action = reState.getAction();
        action.act(reState, null, this.getService());
    } catch (java.lang.Exception e) {
        log.error(((((((simpleName) + "initiateProcessing() finds Exception while handling reNum ") + reNum) + ": ") + e) + ". Message remains in the QueueStore."));
        throw e;
    }
}