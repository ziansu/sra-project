@java.lang.Override
protected java.nio.channels.ServerSocketChannel openChannel() throws java.io.IOException {
    java.nio.channels.ServerSocketChannel channel = org.globus.cog.abstraction.impl.execution.coaster.PortManager.getDefault().openServerSocketChannel();
    org.globus.cog.abstraction.impl.execution.coaster.BootstrapService.logger.info(("Socket bound. URL is " + (getURL())));
    return channel;
}