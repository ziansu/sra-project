public void run() {
    running = true;
    while (running);
    com.mnxfst.testing.consumer.jms.analyzer.ESPMessageAnalyzer.logger.error(((com.mnxfst.testing.consumer.jms.analyzer.ESPMessageAnalyzer.class.getName()) + " shutdown"));
}