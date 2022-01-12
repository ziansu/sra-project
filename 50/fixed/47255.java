@java.lang.Override
public com.netflix.spinnaker.orca.Task completeParallel() {
    try {
        return delegate.completeParallelTask();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException("Unable to instantiate task", e);
    }
}