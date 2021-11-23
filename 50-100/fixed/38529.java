private void createNewIndexConsumer(java.lang.String pHost, java.lang.String pPort) {
    org.ums.solr.indexer.model.MutableIndexConsumer consumer = new org.ums.solr.indexer.PersistentIndexConsumer();
    consumer.setHost(pHost);
    consumer.setInstance(pPort);
    java.util.Date initialDate = new java.util.Date();
    consumer.setHead(initialDate);
    consumer.create();
}