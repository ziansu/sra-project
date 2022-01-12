private void setDelegation(final org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.pcep.ietf.stateful.rev131222.PlspId plspId, final org.opendaylight.protocol.pcep.pcc.mock.api.PccSession session) {
    final org.opendaylight.protocol.pcep.pcc.mock.PccTunnelManagerImpl.Tunnel tunnel = tunnels.get(plspId);
    final int sessionId;
    if (session != null) {
        sessionId = session.getId();
    }else {
        sessionId = org.opendaylight.protocol.pcep.pcc.mock.PccTunnelManagerImpl.PCC_DELEGATION;
    }
    tunnel.setDelegationHolder(sessionId);
}