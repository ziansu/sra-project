public void setHost(java.lang.String host) {
    if (!(host.startsWith(org.moskito.central.storage.graylog.GraylogStorageConfig.HTTP_PREFIX))) {
        host = (org.moskito.central.storage.graylog.GraylogStorageConfig.HTTP_PREFIX) + host;
    }
    this.host = host;
}