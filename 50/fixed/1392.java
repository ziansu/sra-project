@org.junit.Test
public void testInputOperatorWithFailure() throws java.lang.Exception {
    org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.hasFailure = true;
    testInputOperator(true, false);
}