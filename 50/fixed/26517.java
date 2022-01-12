@org.junit.Test
public void openingAConnectionShouldGetHostConfigFromSettings() {
    connectionScheduler.openConnectionToHost(mockSettingsProvider.getHost());
    org.mockito.Mockito.verify(mockSettingsProvider).getHost();
}