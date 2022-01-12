@java.lang.Override
public net.sojourner.projectsidekick.types.PSStatus initialize(java.lang.Object initObject, boolean isServer) {
    if ((_state) != (net.sojourner.projectsidekick.types.BTState.UNKNOWN)) {
        net.sojourner.projectsidekick.utils.Logger.warn("Already initialized()");
        return net.sojourner.projectsidekick.types.PSStatus.OK;
    }
    if (initObject == null) {
        return net.sojourner.projectsidekick.types.PSStatus.FAILED;
    }
    _context = ((android.content.Context) (initObject));
    if ((_bluetoothAdapter.isEnabled()) == false) {
        net.sojourner.projectsidekick.utils.Logger.err("Bluetooth is not enabled");
        return net.sojourner.projectsidekick.types.PSStatus.FAILED;
    }
    setupDeviceLists();
    _isServer = isServer;
    setState(BTState.DISCONNECTED);
    return net.sojourner.projectsidekick.types.PSStatus.OK;
}