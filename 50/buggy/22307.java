private void logBackgroundExceptions() {
    while (true) {
        try {
            detectException();
        } catch (java.lang.Exception e) {
            org.dia.benchmark.kafka.producer.BandwidthProducer.log.log(java.util.logging.Level.WARNING, "Exception thrown on 'sending' background thread.", e);
        }
    } 
}