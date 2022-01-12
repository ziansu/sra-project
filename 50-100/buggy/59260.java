private org.terems.webz.impl.WebzServer webzServer() throws java.io.IOException, org.terems.webz.WebzException {
    org.terems.webz.impl.WebzServer webzServer = this.webzServer;
    if (webzServer == null) {
        synchronized(webzServerMutex) {
            webzServer = this.webzServer;
            if (webzServer == null) {
                this.webzServer = initWebzServer();
            }
        }
    }
    return webzServer;
}