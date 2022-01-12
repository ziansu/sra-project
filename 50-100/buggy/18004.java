private boolean checkForDailyLimitExhaustion() {
    boolean finished = true;
    for (java.lang.String counterparty : counterPartyDailyUsed.keySet()) {
        int used = counterPartyDailyUsed.get(counterparty);
        int limit = counterPartyDailyLimits.get(counterparty);
        finished &= (limit - used) == 0;
    }
    return finished;
}