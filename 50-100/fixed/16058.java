@org.junit.Test
public void testStateCloseAfterCreate() throws java.lang.Exception {
    final org.apache.kafka.streams.StreamsBuilder builder = new org.apache.kafka.streams.StreamsBuilder();
    final org.apache.kafka.streams.KafkaStreams streams = new org.apache.kafka.streams.KafkaStreams(builder.build(), props);
    final org.apache.kafka.streams.KafkaStreamsTest.StateListenerStub stateListener = new org.apache.kafka.streams.KafkaStreamsTest.StateListenerStub();
    streams.setStateListener(stateListener);
    streams.close();
    org.junit.Assert.assertEquals(KafkaStreams.State.NOT_RUNNING, streams.state());
}