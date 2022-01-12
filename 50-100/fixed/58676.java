@java.lang.Override
public void start() {
    this.deviceMastershipManager = new org.opendaylight.openflowplugin.applications.frm.impl.DeviceMastershipManager(clusterSingletonServiceProvider);
    this.flowListener = new org.opendaylight.openflowplugin.applications.frm.impl.FlowForwarder(this, dataService);
    this.groupListener = new org.opendaylight.openflowplugin.applications.frm.impl.GroupForwarder(this, dataService);
    this.meterListener = new org.opendaylight.openflowplugin.applications.frm.impl.MeterForwarder(this, dataService);
    this.tableListener = new org.opendaylight.openflowplugin.applications.frm.impl.TableForwarder(this, dataService);
    this.nodeListener = new org.opendaylight.openflowplugin.applications.frm.impl.FlowNodeReconciliationImpl(this, dataService);
    flowNodeConnectorInventoryTranslatorImpl = new org.opendaylight.openflowplugin.applications.frm.impl.FlowNodeConnectorInventoryTranslatorImpl(this, dataService);
    org.opendaylight.openflowplugin.applications.frm.impl.ForwardingRulesManagerImpl.LOG.info("ForwardingRulesManager has started successfully.");
}