@org.junit.Test
public void testInputOperator() throws java.lang.Exception {
    org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.logger.warn("testInputOperator - {}, {}", testName, hasMultiCluster);
    org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.hasFailure = false;
    testInputOperator(false, false);
}