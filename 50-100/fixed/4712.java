public void init(com.jaspersoft.android.sdk.network.AuthorizedClient client, com.jaspersoft.android.sdk.service.data.server.ServerInfo serverInfo, float scale) {
    if ((reportRenderer) != null) {
        throw new java.lang.RuntimeException("Report fragment is already inited!");
    }
    setWebViewClient();
    reportRenderer = com.jaspersoft.android.sdk.widget.report.renderer.ReportRenderer.create(client, resourceWebView, serverInfo);
    this.scale = scale;
}