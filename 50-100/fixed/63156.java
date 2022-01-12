@java.lang.Override
public void doWithLockNoResult() {
    stopInstances(service, toCleanup);
    if (isUpgrade) {
        reconcileUnits(toCleanup);
        waitForHealthyState(service, currentProcess, strategy);
    }
    markForUpgrade(batchSize, toUpgrade, upgradedUnmanaged, toCleanup);
    if (startFirst) {
        activate(service, toCleanup);
        if (isUpgrade) {
            waitForHealthyState(service, currentProcess, strategy);
        }
        stopInstances(service, toCleanup);
    }else {
        stopInstances(service, toCleanup);
        activate(service, toCleanup);
    }
}