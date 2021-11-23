@java.lang.Override
public void releaseConnection(org.apache.http.HttpClientConnection conn, java.lang.Object newState, long validDuration, java.util.concurrent.TimeUnit timeUnit) {
    open.set(false);
}