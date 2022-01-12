public com.machinepublishers.jbrowserdriver.JBrowserDriver createBrowserInstance() {
    int socketTimeout = java.lang.Integer.parseInt(pluginConfig.get("socket.timeout"));
    int connectTimeout = java.lang.Integer.parseInt(pluginConfig.get("connect.timeout"));
    return new com.machinepublishers.jbrowserdriver.JBrowserDriver(com.machinepublishers.jbrowserdriver.Settings.builder().timezone(Timezone.AMERICA_NEWYORK).ajaxResourceTimeout(edu.usc.irds.sparkler.plugin.FetcherJBrowser.DEFAULT_TIMEOUT).ajaxWait(edu.usc.irds.sparkler.plugin.FetcherJBrowser.DEFAULT_TIMEOUT).socketTimeout(socketTimeout).connectTimeout(connectTimeout).build());
}