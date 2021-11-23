private void changeState(br.eti.kinoshita.circuit_breaker.AbstractCircuitBreaker.State newState) {
    if (state.compareAndSet(newState.oppositeState(), newState)) {
        changeSupport.firePropertyChange(br.eti.kinoshita.circuit_breaker.AbstractCircuitBreaker.PROPERTY_NAME, (!(br.eti.kinoshita.circuit_breaker.AbstractCircuitBreaker.isOpen(newState))), br.eti.kinoshita.circuit_breaker.AbstractCircuitBreaker.isOpen(newState));
    }
}