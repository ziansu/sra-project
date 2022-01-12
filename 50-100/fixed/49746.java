public void stop() throws net.es.lookup.common.exception.LSClientException {
    net.es.lookup.pubsub.client.Cache.LOG.info((("net.es.lookup.pubsub.client.Cache.stop: Stopping " + (connectedSubscribers.size())) + " subscriber connections"));
    for (net.es.lookup.client.Subscriber subscriber : connectedSubscribers) {
        subscriber.shutdown();
    }
    connectedSubscribers.clear();
    net.es.lookup.pubsub.client.Cache.LOG.info((("net.es.lookup.pubsub.client.Cache.stop: Stopped " + (connectedSubscribers.size())) + " subscriber connections"));
}