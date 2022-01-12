@org.junit.Test
public void should_turn_debugging_on_in_transport_from_intent() {
    android.content.Intent serviceDebuggingOnIntent = com.sensorberg.sdk.SensorbergServiceIntents.getServiceLoggingIntent(android.support.test.InstrumentationRegistry.getContext(), true);
    tested.handleDebuggingIntent(serviceDebuggingOnIntent);
    org.mockito.Mockito.verify(tested.transport, org.mockito.Mockito.times(1)).setLoggingEnabled(true);
    org.fest.assertions.api.Assertions.assertThat(Logger.log).isInstanceOf(Logger.VerboseLogger.class);
}