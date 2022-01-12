@org.junit.Test
public void should_turn_debugging_off_in_transport_from_intent() {
    android.content.Intent serviceDebuggingOffIntent = com.sensorberg.sdk.SensorbergServiceIntents.getServiceLoggingIntent(android.support.test.InstrumentationRegistry.getContext(), false);
    tested.handleDebuggingIntent(serviceDebuggingOffIntent, android.support.test.InstrumentationRegistry.getContext(), false);
    org.mockito.Mockito.verify(tested.transport, org.mockito.Mockito.times(1)).setLoggingEnabled(false);
    org.fest.assertions.api.Assertions.assertThat(Logger.log).isEqualTo(Logger.QUIET_LOG);
}