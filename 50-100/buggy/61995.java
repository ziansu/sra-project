@javax.annotation.PostConstruct
private void initialize() {
    java.lang.String host = config.getOBD2WLANHost();
    java.lang.Integer port = config.getOBD2WLANPort();
    if ((org.apache.commons.lang3.StringUtils.isNotEmpty(host)) && (port != null)) {
        connectTask = executorService.scheduleAtFixedRate(() -> connect(), 0, 20, java.util.concurrent.TimeUnit.SECONDS);
    }
}