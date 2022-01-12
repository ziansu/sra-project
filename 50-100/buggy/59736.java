@java.lang.Override
public void bridgeStatusChanged(org.eclipse.smarthome.core.thing.ThingStatusInfo bridgeStatusInfo) {
    if ((bridgeStatusInfo.getStatus()) == (org.eclipse.smarthome.core.thing.ThingStatus.ONLINE)) {
        if ((org.openhab.binding.russound.rio.AbstractBridgeHandler.getThing().getStatusInfo().getStatus()) != (org.eclipse.smarthome.core.thing.ThingStatus.ONLINE)) {
            dispose();
            org.openhab.binding.russound.rio.AbstractBridgeHandler.initialize();
            updateStatus(ThingStatus.ONLINE, ThingStatusDetail.NONE);
        }
    }else
        if ((bridgeStatusInfo.getStatus()) == (org.eclipse.smarthome.core.thing.ThingStatus.OFFLINE)) {
            dispose();
            updateStatus(ThingStatus.OFFLINE, ThingStatusDetail.BRIDGE_OFFLINE);
        }
    
}