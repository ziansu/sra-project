@java.lang.Override
public void checkState() throws br.eti.kinoshita.circuit_breaker.CircuitBreakingException {
    if (isOpen()) {
        throw new br.eti.kinoshita.circuit_breaker.CircuitBreakingException("Memory circuit is open!");
    }
}