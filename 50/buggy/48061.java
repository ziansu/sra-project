@java.lang.Override
public void handlerAdded(io.netty.channel.ChannelHandlerContext ctx) throws java.lang.Exception {
    this.ctx = ctx;
    io.netty.handler.routing.AnchorChannelHandler.LOG.debug(java.text.MessageFormat.format("HANDLER ADDED:[AnchorChannelHandler#{0}#{1}]", this.getAnchorName(), this.parentPipeline.getPipelineName()));
}