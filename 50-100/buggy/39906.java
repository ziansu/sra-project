public void purgeBindings() {
    context.getOwner().purgeBindings(getNodeIdRemote());
    context.getOwner().notifyService();
    try {
        setStateOff(getChannelHandlerContext(org.opendaylight.sxp.core.SxpConnection.ChannelHandlerContextType.ListenerContext));
    } catch (org.opendaylight.sxp.util.exception.connection.ChannelHandlerContextNotFoundException | org.opendaylight.sxp.util.exception.connection.ChannelHandlerContextDiscrepancyException e) {
        org.opendaylight.sxp.core.SxpConnection.LOG.warn("{} Error setting Off connection", this, e);
        setStateOff();
    }
}