@org.junit.Before
public void setup() {
    timeoutConfig = io.github.resilience4j.timeout.TimeoutConfig.custom().timeoutDuration(java.time.Duration.ZERO).build();
    io.github.resilience4j.timeout.internal.TimeoutContext testTimeout = new io.github.resilience4j.timeout.internal.TimeoutContext(timeoutConfig);
    timeout = org.powermock.api.mockito.PowerMockito.spy(testTimeout);
}