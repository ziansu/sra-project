public void douAALUnregistering() {
    org.universAAL.hw.exporter.zigbee.ha.devices.listeners.OnOffLightListener.log.debug("Removing all instances of these devices in uAAL");
    java.util.Iterator iter = onOffLigthDevices.keySet().iterator();
    for (; iter.hasNext();) {
        org.osgi.framework.ServiceReference sref = ((org.osgi.framework.ServiceReference) (iter.next()));
        ((org.universAAL.hw.exporter.zigbee.ha.devices.OnOffLightCallee) (onOffLigthDevices.remove(sref))).unregister();
        context.ungetService(sref);
    }
    onOffLigthDevices.clear();
}