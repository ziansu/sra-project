@java.lang.Override
public void close() throws java.lang.Exception {
    if ((provider) != null) {
        try {
            provider.close();
        } catch (java.lang.InterruptedException e) {
            org.opendaylight.openflowplugin.applications.inventory.manager.InventoryActivator.LOG.warn("Interrupted while waiting for shutdown", e);
        }
        provider = null;
    }
}