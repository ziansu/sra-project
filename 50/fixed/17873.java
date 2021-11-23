@java.lang.Override
public javax.ws.rs.core.Response remove() {
    get();
    org.ovirt.engine.core.common.action.WatchdogParameters parameters = new org.ovirt.engine.core.common.action.WatchdogParameters();
    parameters.setId(templateId);
    parameters.setVm(false);
    return performAction(VdcActionType.RemoveWatchdog, parameters);
}