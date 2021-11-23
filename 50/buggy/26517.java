@org.junit.Test
public void openingAConnectionShouldGetHostConfigFromSettings() {
    connectionScheduler.openConnectionToHost();
    org.mockito.Mockito.verify(mockSettingsProvider).getHost();
}