@org.junit.After
public void tearDown() throws com.microsoft.azure.servicebus.management.ManagementException, com.microsoft.azure.servicebus.primitives.ServiceBusException, java.lang.InterruptedException {
    if (this.shouldCreateEntityForEveryTest()) {
        com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder managementConnectionStringBuilder = new com.microsoft.azure.servicebus.primitives.ConnectionStringBuilder(com.microsoft.azure.servicebus.TestUtils.getNamespaceConnectionString());
        com.microsoft.azure.servicebus.management.EntityManager.deleteEntity(managementConnectionStringBuilder, this.entityName);
    }else {
        this.drainSession();
    }
    this.sender.close();
    if ((this.session) != null)
        this.session.close();
    
    this.factory.close();
}