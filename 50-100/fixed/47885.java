@java.lang.Override
public void onPeerMessage(final org.opendaylight.yangtools.yang.binding.Notification message) {
    if (message instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.PeerDownNotification) {
        onPeerDown();
    }else
        if (message instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.RouteMonitoringMessage) {
            onRouteMonitoring(((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.RouteMonitoringMessage) (message)));
        }else
            if (message instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.StatsReportsMessage) {
                onStatsReports(((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bmp.message.rev150512.StatsReportsMessage) (message)));
            }
        
    
}