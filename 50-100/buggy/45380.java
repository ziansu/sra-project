@java.lang.Override
public void doWithLockNoResult() {
    if (isUpgrade) {
        deploymentMgr.activate(service);
        waitForHealthyState(service, ServiceConstants.STATE_UPGRADING, strategy);
    }
    markForUpgrade(batchSize);
    if (startFirst) {
        activate(service);
        if (isUpgrade) {
            waitForHealthyState(service, currentProcess, strategy);
        }
        stopInstances(service, deploymentUnitInstancesToCleanup);
    }else {
        stopInstances(service, deploymentUnitInstancesToCleanup);
        activate(service);
    }
}