@java.lang.Override
public void finalize() {
    if (((key) != null) && (key.isValid())) {
        org.apache.tomcat.util.net.NioBlockingSelector.log.warn("Possible key leak, cancelling key in the finalizer.");
        try {
            key.cancel();
        } catch (java.lang.Exception ignore) {
        }
    }
}