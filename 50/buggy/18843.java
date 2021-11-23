public boolean isHTTP() {
    return environment.containsKey(BrowserEnvironment.HOST);
}