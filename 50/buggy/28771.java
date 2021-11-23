public com.linkedin.pinot.common.query.context.TimerContext.Timer startNewPhaseTimer(com.linkedin.pinot.common.metrics.ServerQueryPhase queryPhase) {
    com.linkedin.pinot.common.query.context.TimerContext.Timer phaseTimer = phaseTimers.put(queryPhase, new com.linkedin.pinot.common.query.context.TimerContext.Timer(queryPhase));
    phaseTimer.start();
    return phaseTimer;
}