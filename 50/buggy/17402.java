private void incrementCounters() {
    (liTps)++;
    if ((currentState) == (com.kingrunes.somnia.common.util.SomniaState.ACTIVE))
        (currentSleepPeriod)++;
    
}