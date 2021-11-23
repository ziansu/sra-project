public void stop() {
    if (isCrawling()) {
        com.samsanort.yac4j.Crawler.logger.info("Crawler stop requested by user.");
        stopCrawling();
    }
}