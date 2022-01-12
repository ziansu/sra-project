@org.junit.Before
public void setUp() throws java.lang.Exception {
    ((com.sensorberg.sdk.di.TestComponent) (com.sensorberg.sdk.SensorbergTestApplication.getComponent())).inject(this);
    testTransportWithMockService = new com.sensorberg.sdk.internal.transport.RetrofitApiTransport(mockRetrofitApiService, clock);
    tested = new com.sensorberg.sdk.scanner.BeaconActionHistoryPublisher(android.support.test.InstrumentationRegistry.getContext(), testTransportWithMockService, testSettingsManager, clock, testHandlerManager, sharedPreferences, gson);
}