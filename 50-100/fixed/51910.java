public com.machinepublishers.jbrowserdriver.JBrowserDriver createBrowserInstance() {
    java.lang.Integer socketTimeout = ((java.lang.Integer) (pluginConfig.get("socket.timeout")));
    java.lang.Integer connectTimeout = ((java.lang.Integer) (pluginConfig.get("connect.timeout")));
    return new com.machinepublishers.jbrowserdriver.JBrowserDriver(com.machinepublishers.jbrowserdriver.Settings.builder().timezone(Timezone.AMERICA_NEWYORK).ajaxResourceTimeout(edu.usc.irds.sparkler.plugin.FetcherJBrowser.DEFAULT_TIMEOUT).ajaxWait(edu.usc.irds.sparkler.plugin.FetcherJBrowser.DEFAULT_TIMEOUT).socketTimeout(socketTimeout).connectTimeout(connectTimeout).build());
}