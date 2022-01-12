public void addListener(com.netflix.governator.LifecycleListener listener) {
    if (listeners.add(listener)) {
        com.netflix.governator.LifecycleManager.LOG.info("Adding LifecycleListener '{}' {}", listener.getClass().getName(), java.lang.System.identityHashCode(listener));
        if (state.equals(com.netflix.governator.LifecycleManager.State.Started)) {
            com.netflix.governator.LifecycleManager.LOG.info("Starting LifecycleListener '{}'", listener.getClass().getName());
            listener.onStarted();
        }
    }
}