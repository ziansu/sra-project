public java.util.Collection<org.drools.core.time.impl.TimerJobInstance> getTimerJobInstances(java.lang.Integer sessionId) {
    java.util.Map<java.lang.Long, org.drools.core.time.impl.TimerJobInstance> sessionTimerJobs = timerInstances.get(sessionId);
    if (sessionTimerJobs == null) {
        return java.util.Collections.EMPTY_LIST;
    }
    return sessionTimerJobs.values();
}