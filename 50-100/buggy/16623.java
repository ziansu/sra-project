@java.lang.Override
public void incrementAndCheckState(java.lang.Long increment) throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    if ((bytesThreshold) == 0) {
        open();
    }
    long used = this.used.addAndGet(increment);
    if (used > (bytesThreshold)) {
        open();
    }
    checkState();
}