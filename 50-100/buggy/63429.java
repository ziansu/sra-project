public void processFailedEvents() throws java.net.URISyntaxException {
    org.ict4h.atomfeed.client.AtomFeedProperties atomProperties = new org.ict4h.atomfeed.client.AtomFeedProperties();
    atomProperties.setFailedEventMaxRetry(1);
    org.ict4h.atomfeed.client.service.AtomFeedClient atomFeedClient = atomFeedClient(new java.net.URI(this.feedUrl), new org.sharedhealth.migrationservice.feed.encounter.ShrCatchmentEncounterFeedProcessor.FeedEventWorker(encounterEventWorker), atomProperties);
    logger.debug(("Crawling feed:" + (this.feedUrl)));
    atomFeedClient.processFailedEvents();
}