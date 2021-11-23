@java.lang.Override
public void incrementAndCheckState(java.lang.Integer increment) throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    performStateCheck(1);
}