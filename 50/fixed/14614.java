private void runFlowRunnerInThread(final azkaban.execapp.FlowRunner runner) {
    final java.lang.Thread thread = new java.lang.Thread(runner);
    thread.start();
}