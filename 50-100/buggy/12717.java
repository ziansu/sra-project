public org.opendaylight.sxp.util.time.ManagedTimer setTimer(org.opendaylight.yang.gen.v1.urn.opendaylight.sxp.node.rev141002.TimerType timerType, int period) throws org.opendaylight.sxp.util.exception.connection.ChannelHandlerContextDiscrepancyException, org.opendaylight.sxp.util.exception.connection.ChannelHandlerContextNotFoundException, org.opendaylight.sxp.util.exception.unknown.UnknownTimerTypeException {
    io.netty.channel.ChannelHandlerContext ctx = null;
    if (isModeBoth()) {
        if (timerType == (org.opendaylight.yang.gen.v1.urn.opendaylight.sxp.node.rev141002.TimerType.KeepAliveTimer)) {
            ctx = getChannelHandlerContext(org.opendaylight.sxp.core.SxpConnection.ChannelHandlerContextType.SpeakerContext);
        }else {
            ctx = getChannelHandlerContext(org.opendaylight.sxp.core.SxpConnection.ChannelHandlerContextType.ListenerContext);
        }
    }else {
        ctx = getChannelHandlerContext();
    }
    org.opendaylight.sxp.util.time.ManagedTimer timer = org.opendaylight.sxp.util.time.connection.TimerFactory.createTimer(timerType, period, owner, this, ctx);
    this.timers.put(timerType, timer);
    return timer;
}