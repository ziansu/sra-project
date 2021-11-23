@java.lang.Override
protected java.util.List<io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap>> newFactories() {
    java.util.List<io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap>> factories = new java.util.ArrayList<io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap>>();
    for (io.netty.testsuite.transport.TestsuitePermutation.BootstrapComboFactory<io.netty.bootstrap.ServerBootstrap, io.netty.bootstrap.Bootstrap> comboFactory : SocketTestPermutation.INSTANCE.socket()) {
        if ((comboFactory.newClientInstance().config().group()) instanceof io.netty.channel.nio.NioEventLoopGroup) {
            factories.add(comboFactory);
        }
    }
    return factories;
}