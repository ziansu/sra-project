@java.lang.Override
public synchronized void close() {
    if (((this.state) != (org.opendaylight.protocol.bgp.rib.impl.BGPSessionImpl.State.IDLE)) && (this.channel.isActive())) {
        this.writeAndFlush(new org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.bgp.message.rev130919.NotifyBuilder().setErrorCode(BGPError.CEASE.getCode()).setErrorSubcode(BGPError.CEASE.getSubcode()).build());
    }
    this.closeWithoutMessage();
}