public org.symphonyoss.symphony.jcurl.JCurl.Builder connectTimeout(int milliseconds) {
    instance.connectTimeout = milliseconds * 1000;
    return this;
}