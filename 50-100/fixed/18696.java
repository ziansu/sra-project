protected void await(java.util.function.Supplier<java.lang.Boolean> condition, org.polymap.model2.runtime.locking.PessimisticLocking.AccessMode mode) {
    while (!(condition.get())) {
        org.polymap.model2.runtime.locking.PessimisticLocking.log.info((((((java.lang.Thread.currentThread().getName()) + ": await lock: ") + mode) + " on: ") + (context.getEntity().id())));
        try {
            wait(100);
            cleanStaleHolders();
        } catch (java.lang.InterruptedException e) {
        }
    } 
}