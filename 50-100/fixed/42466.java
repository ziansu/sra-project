public synchronized void finishFetchItem(com.digitalpebble.storm.crawler.bolt.FetcherBolt.FetchItem it, boolean asap) {
    com.digitalpebble.storm.crawler.bolt.FetcherBolt.FetchItemQueue fiq = queues.get(it.queueID);
    if (fiq == null) {
        com.digitalpebble.storm.crawler.bolt.FetcherBolt.LOG.warn(("Attempting to finish item from unknown queue: " + (it.queueID)));
        return ;
    }
    fiq.finishFetchItem(it, asap);
}