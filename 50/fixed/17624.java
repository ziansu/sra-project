@java.lang.Override
public boolean checkState() throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    return performStateCheck(0);
}