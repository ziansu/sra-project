private boolean checkForDailyLimitExhaustion() {
    boolean finished = true;
    for (java.lang.String counterparty : counterPartyDailyLimits.keySet()) {
        int limit = counterPartyDailyLimits.get(counterparty);
        java.lang.Integer used = counterPartyDailyUsed.get(counterparty);
        if (used == null)
            used = 0;
        
        finished &= (limit - used) == 0;
    }
    return finished;
}