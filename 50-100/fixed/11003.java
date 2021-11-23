@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    try {
        consumerVertex.scheduleForExecution(consumerVertex.getExecutionGraph().getScheduler(), consumerVertex.getExecutionGraph().isQueuedSchedulingAllowed());
    } catch (java.lang.Throwable t) {
        consumerVertex.fail(new java.lang.IllegalStateException((("Could not schedule consumer " + "vertex ") + consumerVertex), t));
    }
    return true;
}