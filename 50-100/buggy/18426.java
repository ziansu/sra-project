@java.lang.Override
public io.netty.util.concurrent.Future<java.lang.Void> createReconnectingClient(final org.opendaylight.netconf.client.conf.NetconfReconnectingClientConfiguration clientConfiguration) {
    switch (clientConfiguration.getProtocol()) {
        case TCP :
            return createReconnectingTcpClient(clientConfiguration);
        case SSH :
            return createReconnectingSshClient(clientConfiguration);
        default :
            throw new java.lang.IllegalArgumentException(("Unknown client protocol " + (clientConfiguration.getProtocol())));
    }
}