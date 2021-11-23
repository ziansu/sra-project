@java.lang.Override
protected io.datakernel.eventloop.SocketConnection createConnection(java.nio.channels.SocketChannel socketChannel) {
    assert eventloop.inEventloopThread();
    io.datakernel.eventloop.DatakernelSslEngine engine = null;
    if ((sslContext) != null) {
        javax.net.ssl.SSLEngine ssl = sslContext.createSSLEngine();
        ssl.setUseClientMode(false);
        engine = new io.datakernel.eventloop.DatakernelSslEngine(ssl, executor);
    }
    io.datakernel.http.HttpServerConnection connection = new io.datakernel.http.HttpServerConnection(eventloop, socketChannel, engine, servlet, connectionsList, headerChars, maxHttpMessageSize);
    if (connectionsList.isEmpty())
        scheduleExpiredConnectionCheck();
    
    return connection;
}