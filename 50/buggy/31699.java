@java.lang.Override
public void cancel() {
    tokenDisposed();
    org.springframework.ide.eclipse.boot.dash.cloudfoundry.client.v1.DefaultClientRequestsV1.debug(((("streamLogs " + appName) + " canceled token : ") + orgToken));
}