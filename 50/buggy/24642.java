@java.lang.Override
public void initialize(org.irmacard.cardemu.httpclient.HttpRequest httpRequest) throws java.io.IOException {
    httpRequest.setConnectTimeout(timeout);
    httpRequest.setReadTimeout(timeout);
}