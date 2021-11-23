public boolean compareClassificationTableCookie(org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.FlowCookie cookie) {
    return cookie.getValue().equals(org.opendaylight.sfc.l2renderer.openflow.SfcL2FlowProgrammerOFimpl.TRANSPORT_EGRESS_COOKIE);
}