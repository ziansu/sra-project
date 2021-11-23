public void testConnectSocket() {
    try {
        factory.connectSocket(1000, null, new org.apache.http.HttpHost(sampleTlsEndpoint.getHostName()), sampleTlsEndpoint, null, null);
    } catch (java.io.IOException e) {
        android.util.Log.e(at.bitfire.davdroid.webdav.TlsSniSocketFactoryTest.TAG, "I/O exception", e);
        fail();
    }
}