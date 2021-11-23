private void waitForCompleteRuns(int numRuns, final co.cask.cdap.proto.id.ProgramId program) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
    co.cask.cdap.common.utils.Tasks.waitFor(numRuns, new java.util.concurrent.Callable<java.lang.Integer>() {
        @java.lang.Override
        public java.lang.Integer call() throws java.lang.Exception {
            return getRuns(program);
        }
    }, 10, java.util.concurrent.TimeUnit.SECONDS);
}