protected long nextJobTime() {
    assert _lock.isLocked();
    org.wso2.carbon.bpmn.people.substitution.scheduler.ScheduledTask job = _todo.peek();
    if (job == null)
        return java.lang.Long.MAX_VALUE;
    
    return java.lang.Math.max(0, ((job.schedDate) - (java.lang.System.currentTimeMillis())));
}