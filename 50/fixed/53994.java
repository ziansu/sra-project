@java.lang.Override
public void handleRecordMessage(org.neo4j.driver.Value[] fields) {
    org.neo4j.driver.internal.spi.StreamCollector collector = collectors.get(((responseId) - 1));
    if (collector != null) {
        collector.record(fields);
    }
}