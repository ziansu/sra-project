public com.linkedin.pinot.common.query.context.TimerContext.Timer startNewPhaseTimer(com.linkedin.pinot.common.metrics.ServerQueryPhase queryPhase) {
    com.linkedin.pinot.common.query.context.TimerContext.Timer phaseTimer = new com.linkedin.pinot.common.query.context.TimerContext.Timer(queryPhase);
    phaseTimers.put(queryPhase, phaseTimer);
    phaseTimer.start();
    return phaseTimer;
}