@java.lang.Override
public void onSessionInitiated(org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext session) {
    ipsecService = session.addRpcImplementation(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ipsec.rev150105.IPsecService.class, new org.opendaylight.ipsec.impl.IPsecImpl());
    org.opendaylight.ipsec.impl.IPsecProvider.LOG.info("IPsec Provider Session Initiated");
    notificationServer = new org.opendaylight.ipsec.communication.IPsecNotificationServer();
    notificationServer.start();
    org.opendaylight.ipsec.Test.addTestData();
    org.opendaylight.ipsec.impl.IPsecProvider.LOG.info("IPsec Notification Server Initiated");
}