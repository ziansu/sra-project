private java.net.URL resolveRelative(java.lang.String name) {
    try {
        return new java.net.URL(this.self.getProtocol(), this.self.getHost(), this.self.getPort(), ((this.basePath) + (name.trim())));
    } catch (java.net.MalformedURLException e) {
        de.skuzzle.tinyplugz.PluginClassLoader.LOG.error("Error constructing relative url with base path '{}' and name '{}'", this.basePath, name, e);
    }
    return null;
}