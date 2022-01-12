<T> ch.sourcepond.commons.smartswitch.lib.SmartSwitch<T> create(final java.util.function.Supplier<T> pSupplier, final java.util.function.Consumer<T> pShutdownHookOrNull, final ch.sourcepond.commons.smartswitch.lib.ToDefaultSwitchObserver<T> pObserverOrNull) {
    return new ch.sourcepond.commons.smartswitch.lib.SmartSwitch(executorService, pSupplier, pShutdownHookOrNull, pObserverOrNull);
}