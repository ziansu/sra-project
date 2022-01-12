public void addExchangeToQueue(com.predic8.membrane.core.exchange.Exchange exc) {
    java.lang.String apiKey = ((java.lang.String) (exc.getProperty(Exchange.API_KEY)));
    java.util.concurrent.ConcurrentLinkedQueue<com.predic8.membrane.core.exchange.Exchange> exchangeQueue = exchangesForApiKey.get(apiKey);
    if (exchangeQueue == null) {
        java.util.concurrent.ConcurrentLinkedQueue<com.predic8.membrane.core.exchange.Exchange> newValue = new java.util.concurrent.ConcurrentLinkedQueue<com.predic8.membrane.core.exchange.Exchange>();
        exchangeQueue = exchangesForApiKey.putIfAbsent(apiKey, newValue);
        if (exchangeQueue == null)
            exchangeQueue = newValue;
        
    }
    exchangeQueue.add(exc);
}