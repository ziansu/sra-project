org.asteriskjava.manager.event.ManagerEvent destroyBridge(org.asteriskjava.manager.event.BridgeDestroyEvent event) {
    org.asteriskjava.manager.internal.backwardsCompatibility.bridge.BridgeState state = org.asteriskjava.manager.internal.backwardsCompatibility.bridge.BridgesActive.activeBridges.remove(event.getBridgeUniqueId());
    if (state != null) {
        return state.destroy();
    }
    logger.info(("Cant find bridge for id " + (event.getBridgeUniqueId())));
    return null;
}