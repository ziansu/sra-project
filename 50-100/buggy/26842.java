@org.junit.Test
public void notifyTheMerlinServiceOnValidConnectivityIntents() throws java.lang.Exception {
    android.content.Intent mockIntent = mock(android.content.Intent.class);
    when(mockIntent.getAction()).thenReturn(ConnectivityManager.CONNECTIVITY_ACTION);
    connectivityReceiver.onReceive(context, mockIntent);
    verify(merlinService).onConnectivityChanged(org.mockito.Matchers.any(com.novoda.merlin.receiver.ConnectivityChangeEvent.class));
}