@org.opennms.netmgt.model.events.annotations.EventHandler(uei = org.opennms.netmgt.EventConstants.RELOAD_IMPORT_UEI)
public void doImport(final org.opennms.netmgt.xml.event.Event event) {
    final java.lang.String url = getEventUrl(event);
    final java.lang.String rescanExistingOnImport = getEventRescanExistingOnImport(event);
    if (url != null) {
        doImport(url, rescanExistingOnImport);
    }else {
        final java.lang.String msg = "reloadImport event requires 'url' parameter";
        org.opennms.netmgt.provision.service.Provisioner.LOG.error("doImport: {}", msg);
        send(importFailedEvent(msg, url));
    }
}