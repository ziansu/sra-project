@java.lang.Override
public void stop() {
    try {
        if (((product) != null) && ((triggerUrl) != null)) {
            server.removeWebHookSubscription(product, triggerUrl.toString());
        }
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.RuntimeException(e);
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}