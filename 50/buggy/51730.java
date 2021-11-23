@java.lang.Override
public void stop() {
    kafkaStreams.close();
    stroom.stats.streams.StatisticsFlatMappingProcessor.LOGGER.info("Stopped processor {} for input topic {}", appId, inputTopic);
}