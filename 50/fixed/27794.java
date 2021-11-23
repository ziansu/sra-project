@java.lang.Override
public void close() {
    if ((httpclient) != null) {
        this.httpclient.getConnectionManager().shutdown();
    }
}