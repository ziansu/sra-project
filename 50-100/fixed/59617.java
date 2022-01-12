@org.junit.Test
public void testCNRS() throws java.lang.Exception {
    org.speedd.TimedEventFileReader eventReader = new org.speedd.TimedEventFileReader(org.speedd.TestTrafficManagement.class.getClassLoader().getResource("simulator_data_incident_short.csv").getPath(), "speedd-traffic-in-events", createProducerConfig(), new org.speedd.traffic.TrafficAimsunReadingCsv2Event(org.speedd.data.impl.SpeeddEventFactory.getInstance()));
    streamEventsAndVerifyResults("speedd-traffic.properties", "traffic", eventReader, new java.lang.String[]{ "AverageDensityAndSpeedPerLocation" }, new java.lang.String[]{  });
}