@java.lang.Override
public synchronized void onSessionDown(final org.opendaylight.protocol.pcep.pcc.mock.api.PccSession session) {
    for (final java.util.Map.Entry<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.pcep.ietf.stateful.rev131222.PlspId, org.opendaylight.protocol.pcep.pcc.mock.PccTunnelManagerImpl.Tunnel> entry : this.tunnels.entrySet()) {
        final org.opendaylight.protocol.pcep.pcc.mock.PccTunnelManagerImpl.Tunnel tunnel = entry.getValue();
        final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.pcep.ietf.stateful.rev131222.PlspId plspId = entry.getKey();
        if (org.opendaylight.protocol.pcep.pcc.mock.PccTunnelManagerImpl.hasDelegation(tunnel, session)) {
            startStateTimeout(tunnel, entry.getKey());
            startRedelegationTimer(tunnel, plspId, session);
        }
    }
}