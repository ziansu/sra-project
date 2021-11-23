private boolean isHubReachable() {
    io.subutai.core.hubmanager.api.HubManager hubManager = io.subutai.common.util.ServiceLocator.getServiceOrNull(io.subutai.core.hubmanager.api.HubManager.class);
    return (hubManager != null) && (hubManager.isHubReachable());
}