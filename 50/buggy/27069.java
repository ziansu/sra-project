public void consumeDrone(java.lang.String buildingName) {
    (workerNumber)--;
    resourcesHandler.decreaseMin(5);
    resourcesHandler.miningPQPeekRemove(buildingName);
    supplyHandler.decreaseSupply(xUnit[0].getSupply());
}