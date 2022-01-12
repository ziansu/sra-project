@java.lang.Override
protected java.util.List<io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap>> newFactories() {
    java.util.List<io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap>> factories = new java.util.ArrayList<io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap>>();
    for (io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap> comboFactory : EpollSocketTestPermutation.INSTANCE.socket()) {
        io.netty.channel.EventLoopGroup group = comboFactory.newClientInstance().config().group();
        if ((group instanceof io.netty.channel.nio.NioEventLoopGroup) || (group instanceof io.netty.channel.epoll.EpollEventLoopGroup)) {
            factories.add(comboFactory);
        }
    }
    return factories;
}