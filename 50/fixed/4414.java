@java.lang.Override
public void httpClientConnect(io.undertow.client.UndertowClient httpClient, io.undertow.client.ClientCallback<io.undertow.client.ClientConnection> listener, java.net.URI uri, org.xnio.XnioWorker worker, org.xnio.OptionMap options) {
    org.springframework.util.ReflectionUtils.invokeMethod(httpClientConnectCallbackMethod, httpClient, listener, uri, worker, this.undertowBufferPool, options);
}