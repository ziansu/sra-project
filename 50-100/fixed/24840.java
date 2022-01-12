public void install(@javax.enterprise.event.Observes
org.hawkular.inventory.cdi.InventoryInitialized event) throws javax.jms.JMSException, javax.naming.NamingException {
    org.hawkular.inventory.bus.BusIntegration integration = integrations.get(event.getInventory());
    if (integration == null) {
        integration = newIntegration(event.getInventory());
        integrations.put(event.getInventory(), integration);
    }
}