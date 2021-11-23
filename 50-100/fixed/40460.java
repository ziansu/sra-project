public static void shutdownNFHttpClient(java.lang.String name) {
    org.apache.http.client.HttpClient c = com.netflix.http4.NFHttpClientFactory.namedClientMap.get(name);
    if (c != null) {
        c.getConnectionManager().shutdown();
        com.netflix.http4.NFHttpClientFactory.namedClientMap.remove(name);
        com.netflix.servo.monitor.Monitors.unregisterObject(name, c);
    }
}