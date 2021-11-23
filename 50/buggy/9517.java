public void run() {
    context.getInChannel().setAttachment(context);
    cgl.iotcloud.streaming.http.server.HttpClientEndpoint endpoint = context.getRule().getEndpoint();
    endpoint.connect(context);
}