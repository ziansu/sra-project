private boolean isTestingPhase() {
    java.lang.String phase = execution.getLifecyclePhase();
    return ("test".equals(phase)) || ("integration-test".equals(phase));
}