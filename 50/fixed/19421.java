public void setWsUri(java.lang.String wsUri) {
    if (wsUri != null) {
        java.lang.System.setProperty(org.kurento.test.config.TestConfiguration.KMS_WS_URI_PROP_EXPORT, wsUri);
    }
    this.wsUri = wsUri;
}