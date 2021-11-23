public void start() throws java.io.IOException, org.apache.ignite.IgniteCheckedException {
    endpoint = org.apache.ignite.internal.util.ipc.IpcEndpointFactory.connectEndpoint(endpointAddr, log);
    out = new java.io.BufferedOutputStream(endpoint.outputStream());
    in = new java.io.BufferedInputStream(endpoint.inputStream());
    handshake();
}