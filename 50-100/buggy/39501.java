private void closeOps(java.nio.channels.SocketChannel channel, int opsToClose) throws java.nio.channels.ClosedChannelException {
    com.github.luohaha.context.ContextBean bean = this.context.getChanToContextBean().get(channel);
    int ops = bean.getOps();
    ops ^= opsToClose;
    bean.setOps(ops);
    channel.register(this.selector, ops);
}