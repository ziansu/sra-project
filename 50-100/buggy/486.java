public void testConnectSocket() {
    try {
        @lombok.Cleanup
        javax.net.ssl.SSLSocket socket = factory.createSocket(null);
        factory.connectSocket(1000, socket, new org.apache.http.HttpHost(sampleTlsEndpoint.getHostName()), sampleTlsEndpoint, null, null);
    } catch (java.io.IOException e) {
        android.util.Log.e(at.bitfire.davdroid.webdav.TlsSniSocketFactoryTest.TAG, "I/O exception", e);
        fail();
    }
}