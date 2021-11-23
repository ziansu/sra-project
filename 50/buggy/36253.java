public boolean hasActiveTransactionInterceptor() {
    if ((com.oneandone.ejbcdiunit.persistence.SimulatedTransactionManager.activeTransactionInterceptor.get()) == null) {
        com.oneandone.ejbcdiunit.persistence.SimulatedTransactionManager.activeTransactionInterceptor.set(true);
    }
    return com.oneandone.ejbcdiunit.persistence.SimulatedTransactionManager.activeTransactionInterceptor.get();
}