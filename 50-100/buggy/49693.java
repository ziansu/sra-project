@java.lang.Override
protected com.domotic.enhanced.client.Response<java.lang.String> execute() {
    try (java.net.Socket socket = initSocket(request().getConfig(), TIMEOUT);java.io.BufferedReader reader = initReader(socket);java.io.PrintWriter writer = initWriter(socket)) {
        handshake(reader, writer);
        return new com.domotic.enhanced.client.Response<java.lang.String>(send(reader, writer));
    } catch (java.io.IOException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e) {
        throw new com.domotic.enhanced.DomoticException("client connection failure", e);
    }
}