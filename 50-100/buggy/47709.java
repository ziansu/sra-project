@java.lang.Override
public void onTimeout(long reqId, java.lang.String header, java.lang.String sequence) {
    biospectra.classify.server.RabbitMQInputClient client = this.getClient();
    client.reportTimeout();
    if ((responseHandler) != null) {
        synchronized(responseHandler) {
            responseHandler.onTimeout(reqId, header, sequence);
        }
    }else {
        biospectra.classify.ClassifierClient.LOG.error("responseHandler is not set");
    }
}